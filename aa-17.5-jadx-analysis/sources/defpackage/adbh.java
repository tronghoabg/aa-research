package defpackage;

/* loaded from: classes.dex */
public final class adbh implements adbf {
    private static final war a;
    private static final war b;
    private static final war c;
    private static final war d;
    private static final war e;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wapVarA.e("aa_google_setting_enabled", true);
        int i = 0;
        wapVarA.e("LegacyCarSetupFlags__aa_google_setting_use_device_locale_support_checker", false);
        a = wapVarA.c("car_max_reminder_notification_count", 3L);
        wapVarA.d("frx_gearhead_package", "com.google.android.projection.gearhead:166661440");
        wapVarA.d("frx_gsa_package", "com.google.android.googlequicksearchbox:301075400");
        b = wapVarA.e("LegacyCarSetupFlags__frx_maps_bypass_enabled", false);
        c = wapVarA.d("frx_maps_bypass_list", "");
        wapVarA.f("LegacyCarSetupFlags__frx_maps_conditional_value_encoded_param", new adbg(i), "EikKJ2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLm1hcHM6MTA2MDAwMDAwMBohCgJrchIbChljb20ubG9jbmFsbC5LaW1HaVNhOjQwNDAy");
        wapVarA.d("frx_tts_package", "com.google.android.tts:210307100");
        wapVarA.f("LegacyCarSetupFlags__is_device_country_allowlisted_conditional_value_encoded_param", new adbg(i), "EgIQABoICgJhbBICEAEaCAoCYW0SAhABGggKAmFvEgIQARoICgJhchICEAEaCAoCYXQSAhABGggKAmF1EgIQARoICgJiYRICEAEaCAoCYmUSAhABGggKAmJnEgIQARoICgJibxICEAEaCAoCYnISAhABGggKAmJ3EgIQARoICgJieRICEAEaCAoCY2ESAhABGggKAmNoEgIQARoICgJjbBICEAEaCAoCY28SAhABGggKAmNyEgIQARoICgJjeRICEAEaCAoCY3oSAhABGggKAmRlEgIQARoICgJkaxICEAEaCAoCZG8SAhABGggKAmVjEgIQARoICgJlZRICEAEaCAoCZXMSAhABGggKAmZpEgIQARoICgJmchICEAEaCAoCZ2ISAhABGggKAmdyEgIQARoICgJndBICEAEaCAoCaHISAhABGggKAmh1EgIQARoICgJpZBICEAEaCAoCaWUSAhABGggKAmluEgIQARoICgJpcxICEAEaCAoCaXQSAhABGggKAmpwEgIQARoICgJrchICEAEaCAoCbHQSAhABGggKAmx1EgIQARoICgJsdhICEAEaCAoCbWQSAhABGggKAm1rEgIQARoICgJtdBICEAEaCAoCbXgSAhABGggKAm5sEgIQARoICgJubxICEAEaCAoCbnoSAhABGggKAnBhEgIQARoICgJwZRICEAEaCAoCcGgSAhABGggKAnBsEgIQARoICgJwchICEAEaCAoCcHQSAhABGggKAnB5EgIQARoICgJybxICEAEaCAoCcnMSAhABGggKAnJ1EgIQARoICgJzZRICEAEaCAoCc2cSAhABGggKAnNpEgIQARoICgJzaxICEAEaCAoCdGgSAhABGggKAnRyEgIQARoICgJ0dxICEAEaCAoCdWESAhABGggKAnVzEgIQARoICgJ1eRICEAEaCAoCdmUSAhABGggKAnphEgIQAQ");
        wapVarA.e("LegacyCarSetupFlags__is_device_country_blocked", false);
        d = wapVarA.e("LegacyCarSetupFlags__is_phone_denylisted", false);
        e = wapVarA.d("manufacturer_blacklist", "");
    }

    @Override // defpackage.adbf
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.adbf
    public final String b() {
        return (String) c.b();
    }

    @Override // defpackage.adbf
    public final String c() {
        return (String) e.b();
    }

    @Override // defpackage.adbf
    public final boolean d() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.adbf
    public final boolean e() {
        return ((Boolean) d.b()).booleanValue();
    }
}
