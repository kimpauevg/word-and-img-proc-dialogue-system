require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    state: Hello
        q!: $regex</start>
        q!: * (start) *
        q!: * (~hello) *
        q!: * (привет/здравствуй*) *
        random: 
            a: Привет!
            a: Здравствуй!
        intent: /hello || toState = "./"

    state: Weather
        q!: *weather
        q!: * (~weather)*
        q!: * (погод*)*
        q!: * (солн*) *
        q!: * (влаж*) *
        q!: * (дожд*) *
        a: Сегодня в Санкт-петербурге облачно, без осадков, температура -2 градуса по Цельсию

    state: Currency
        q!: * (~currency) *
        q!: * (~rate) *
        q!: * (~курс) *
        q!: * (валют*) *
        q!: * (валют*) *
        q!: * (руб*) *
        q!: * (долл*) *
        a: Текущие крусы валют - доллар: 76.02, евро: 80.48

    state: NoMatch
        event!: noMatch
        a: Извините, я не понял, что вы хотели. Вы сказали: {{$request.query}}.

    state: Match
        event!: match
        a: {{$context.intent.answer}}