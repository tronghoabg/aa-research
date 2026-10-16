package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akcz {
    public static final java.lang.String a = "akcz";
    public static final java.util.Set b;
    public org.json.JSONObject c;

    static {
        java.lang.String[] strArr = {"CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT"};
        java.util.HashSet hashSet = new java.util.HashSet(228);
        for (int i = 0; i < 228; i++) {
            java.lang.String str = strArr[i];
            str.getClass();
            if (!hashSet.add(str)) {
                throw new java.lang.IllegalArgumentException("duplicate element: ".concat(str));
            }
        }
        b = j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    public akcz(java.lang.String str) {
        this.c = new org.json.JSONObject();
        if (o(str)) {
            return;
        }
        try {
            this.c = (org.json.JSONObject) new org.json.JSONTokener(str).nextValue();
        } catch (java.lang.ClassCastException | org.json.JSONException e) {
            java.lang.String str2 = a;
            if (defpackage.agwk.i(str2, 2)) {
                defpackage.agwk.g(str2, java.lang.String.format("Experimental options could not be parsed, using default values. Error: %s", e.getMessage()), new java.lang.Object[0]);
            }
        }
    }

    public static final boolean o(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    public final int a() {
        return ((java.lang.Integer) f("QUIC", "idle_connection_timeout_seconds", -1, java.lang.Integer.class)).intValue();
    }

    public final int b() {
        return ((java.lang.Integer) f("QUIC", "max_server_configs_stored_in_properties", -1, java.lang.Integer.class)).intValue();
    }

    public final int c() {
        return ((java.lang.Integer) f("StaleDNS", "delay_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final int d() {
        return ((java.lang.Integer) f("StaleDNS", "max_expired_time_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final int e() {
        return ((java.lang.Integer) f("StaleDNS", "persist_delay_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Class cls) {
        org.json.JSONObject jSONObject;
        if (this.c.length() == 0) {
            return obj;
        }
        try {
            jSONObject = this.c.getJSONObject(str);
        } catch (org.json.JSONException e) {
            java.lang.String str3 = a;
            if (defpackage.agwk.i(str3, 2)) {
                defpackage.agwk.g(str3, java.lang.String.format("Failed to get %s options: %s", str, e.getMessage()), new java.lang.Object[0]);
            }
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return obj;
        }
        try {
            return cls.cast(jSONObject.get(str2));
        } catch (java.lang.ClassCastException | org.json.JSONException e2) {
            java.lang.String str4 = a;
            if (!defpackage.agwk.i(str4, 2)) {
                return obj;
            }
            defpackage.agwk.g(str4, java.lang.String.format("Failed to get %s options: %s", str2, e2.getMessage()), new java.lang.Object[0]);
            return obj;
        }
    }

    public final java.lang.String g() {
        return (java.lang.String) f("QUIC", "host_whitelist", null, java.lang.String.class);
    }

    public final defpackage.akdb h() {
        return defpackage.akdb.a((java.lang.Boolean) f("AsyncDNS", "enable", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb i() {
        return defpackage.akdb.a((java.lang.Boolean) f("QUIC", "migrate_sessions_early_v2", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb j() {
        return defpackage.akdb.a((java.lang.Boolean) f("QUIC", "migrate_sessions_on_network_change_v2", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb k() {
        return defpackage.akdb.a((java.lang.Boolean) f("StaleDNS", "allow_other_network", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb l() {
        return defpackage.akdb.a((java.lang.Boolean) f("StaleDNS", "enable", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb m() {
        return defpackage.akdb.a((java.lang.Boolean) f("StaleDNS", "persist_to_disk", null, java.lang.Boolean.class));
    }

    public final defpackage.akdb n() {
        return defpackage.akdb.a((java.lang.Boolean) f("StaleDNS", "use_stale_on_name_not_resolved", null, java.lang.Boolean.class));
    }
}
