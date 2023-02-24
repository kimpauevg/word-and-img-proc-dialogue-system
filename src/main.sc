require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    state: Hello
        q!: *start 
        q!: *h*
        random: 
            a: Hello!
            a: Hi!
            a: Greetings!
            
    state: Weather
        q!: *weather
        q!: *we*
        a: Current weather in Saint Petersburg is cloudy, -2 С

    state: Currency
        q!: *currency
        q!: *cu*
        a: Current currency exchange rates - USDRUB: 76.02, EURRUB: 80.48 

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}