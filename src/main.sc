theme: /
    state: /hello
        q!: $regex</start>
        q!: * (start) *
        q!: * (~hello) *
        q!: * (прив*/здравствуй*) *
        random: 
            a: Привет!
            a: Здравствуй!

        state: /hello/weather
            q: *weather
            q: * (~weather)*
            q: * (погод*)*
            q: * (солн*) *
            q: * (влаж*) *
            q: * (дожд*) *
            a: Сегодня в Санкт-петербурге облачно, без осадков, температура -2 градуса по Цельсию

        state: /hello/currency
            q: * (~currency) *
            q: * (~rate) *
            q: * (курс*) *
            q: * (валют*) *
            q: * (валют*) *
            q: * (руб*) *
            q: * (долл*) *
            a: Текущие крусы валют - доллар: 76.02, евро: 80.48

    state: /noMatch
        event!: noMatch
        a: Извините, я не понял, что вы хотели. Вы сказали: {{$request.query}}.
