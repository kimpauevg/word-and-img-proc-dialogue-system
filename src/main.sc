require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    state: Hello
        q!: $regex</start>
        q!: * (start) *
        q!: * (~hello) *
        q!: * (привет/здравствуй*) *
        random: 
            a: Hello!
            a: Hi!
            a: Greetings!
        intent: /hello || toState = "./"

    state: Weather
        q!: *weather
        q!: * (~weather)*
        q!: * (погод*)*
        a: Current weather in Saint Petersburg is cloudy, -2 С

    state: Currency
        q!: * (~currency) *
        q!: * (~rate) *
        q!: * (~курс) *
        a: Current currency exchange rates - USDRUB: 76.02, EURRUB: 80.48

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}