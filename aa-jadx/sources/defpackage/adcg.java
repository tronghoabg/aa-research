package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adcg implements defpackage.adce {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;
    private static final defpackage.wbn c;
    private static final defpackage.wbn d;
    private static final defpackage.wbn e;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wblVarA.e("aa_google_setting_enabled", true);
        int i = 0;
        wblVarA.e("LegacyCarSetupFlags__aa_google_setting_use_device_locale_support_checker", false);
        a = wblVarA.c("car_max_reminder_notification_count", 3L);
        wblVarA.d("frx_gearhead_package", "com.google.android.projection.gearhead:168661850");
        wblVarA.d("frx_gsa_package", "com.google.android.googlequicksearchbox:301075400");
        b = wblVarA.e("LegacyCarSetupFlags__frx_maps_bypass_enabled", false);
        c = wblVarA.d("frx_maps_bypass_list", "");
        wblVarA.f("LegacyCarSetupFlags__frx_maps_conditional_value_encoded_param", new defpackage.adcf(i), "EikKJ2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLm1hcHM6MTA2MDAwMDAwMBohCgJrchIbChljb20ubG9jbmFsbC5LaW1HaVNhOjQwNDAy");
        wblVarA.d("frx_tts_package", "com.google.android.tts:210307100");
        wblVarA.f("LegacyCarSetupFlags__is_device_country_allowlisted_conditional_value_encoded_param", new defpackage.adcf(i), "EgIQABoICgJhbBICEAEaCAoCYW0SAhABGggKAmFvEgIQARoICgJhchICEAEaCAoCYXQSAhABGggKAmF1EgIQARoICgJiYRICEAEaCAoCYmUSAhABGggKAmJnEgIQARoICgJibxICEAEaCAoCYnISAhABGggKAmJ3EgIQARoICgJieRICEAEaCAoCY2ESAhABGggKAmNoEgIQARoICgJjbBICEAEaCAoCY28SAhABGggKAmNyEgIQARoICgJjeRICEAEaCAoCY3oSAhABGggKAmRlEgIQARoICgJkaxICEAEaCAoCZG8SAhABGggKAmVjEgIQARoICgJlZRICEAEaCAoCZXMSAhABGggKAmZpEgIQARoICgJmchICEAEaCAoCZ2ISAhABGggKAmdyEgIQARoICgJndBICEAEaCAoCaHISAhABGggKAmh1EgIQARoICgJpZBICEAEaCAoCaWUSAhABGggKAmluEgIQARoICgJpcxICEAEaCAoCaXQSAhABGggKAmpwEgIQARoICgJrchICEAEaCAoCbHQSAhABGggKAmx1EgIQARoICgJsdhICEAEaCAoCbWQSAhABGggKAm1rEgIQARoICgJtdBICEAEaCAoCbXgSAhABGggKAm5sEgIQARoICgJubxICEAEaCAoCbnoSAhABGggKAnBhEgIQARoICgJwZRICEAEaCAoCcGgSAhABGggKAnBsEgIQARoICgJwchICEAEaCAoCcHQSAhABGggKAnB5EgIQARoICgJybxICEAEaCAoCcnMSAhABGggKAnJ1EgIQARoICgJzZRICEAEaCAoCc2cSAhABGggKAnNpEgIQARoICgJzaxICEAEaCAoCdGgSAhABGggKAnRyEgIQARoICgJ0dxICEAEaCAoCdWESAhABGggKAnVzEgIQARoICgJ1eRICEAEaCAoCdmUSAhABGggKAnphEgIQAQ");
        wblVarA.e("LegacyCarSetupFlags__is_device_country_blocked", false);
        d = wblVarA.e("LegacyCarSetupFlags__is_phone_denylisted", false);
        e = wblVarA.d("manufacturer_blacklist", "");
    }

    @Override // defpackage.adce
    public final long a() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.adce
    public final java.lang.String b() {
        return (java.lang.String) c.b();
    }

    @Override // defpackage.adce
    public final java.lang.String c() {
        return (java.lang.String) e.b();
    }

    @Override // defpackage.adce
    public final boolean d() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adce
    public final boolean e() {
        return ((java.lang.Boolean) d.b()).booleanValue();
    }
}
