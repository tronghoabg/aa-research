package defpackage;

/* loaded from: classes2.dex */
public final class gfg implements gfa {
    public final gcs a;
    private final geu b;
    private final hlv c;
    private final int d;

    public /* synthetic */ gfg(geu geuVar, gcs gcsVar, hlv hlvVar, int i) {
        if ((i & 4) != 0) {
            hlvVar = hlv.a;
            hlvVar.getClass();
        }
        hlvVar.getClass();
        this.b = geuVar;
        this.a = gcsVar;
        this.c = hlvVar;
        this.d = -1;
    }

    @Override // defpackage.gfa
    public final boolean a() {
        return !fzo.h(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049d A[Catch: all -> 0x0680, TryCatch #0 {all -> 0x0680, blocks: (B:129:0x03ba, B:131:0x03c7, B:133:0x03cd, B:151:0x049d, B:156:0x04df, B:158:0x04eb, B:160:0x04f6, B:159:0x04f2, B:152:0x04ad, B:154:0x04b9, B:155:0x04c5, B:135:0x03fd, B:137:0x0401, B:138:0x042c, B:140:0x0430, B:146:0x0479, B:145:0x045c, B:147:0x0482, B:149:0x048a, B:161:0x052d, B:162:0x054a, B:165:0x0550, B:167:0x056c, B:169:0x057f, B:172:0x0590, B:173:0x059f), top: B:266:0x03ba }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ad A[Catch: all -> 0x0680, TryCatch #0 {all -> 0x0680, blocks: (B:129:0x03ba, B:131:0x03c7, B:133:0x03cd, B:151:0x049d, B:156:0x04df, B:158:0x04eb, B:160:0x04f6, B:159:0x04f2, B:152:0x04ad, B:154:0x04b9, B:155:0x04c5, B:135:0x03fd, B:137:0x0401, B:138:0x042c, B:140:0x0430, B:146:0x0479, B:145:0x045c, B:147:0x0482, B:149:0x048a, B:161:0x052d, B:162:0x054a, B:165:0x0550, B:167:0x056c, B:169:0x057f, B:172:0x0590, B:173:0x059f), top: B:266:0x03ba }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04eb A[Catch: all -> 0x0680, TryCatch #0 {all -> 0x0680, blocks: (B:129:0x03ba, B:131:0x03c7, B:133:0x03cd, B:151:0x049d, B:156:0x04df, B:158:0x04eb, B:160:0x04f6, B:159:0x04f2, B:152:0x04ad, B:154:0x04b9, B:155:0x04c5, B:135:0x03fd, B:137:0x0401, B:138:0x042c, B:140:0x0430, B:146:0x0479, B:145:0x045c, B:147:0x0482, B:149:0x048a, B:161:0x052d, B:162:0x054a, B:165:0x0550, B:167:0x056c, B:169:0x057f, B:172:0x0590, B:173:0x059f), top: B:266:0x03ba }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f2 A[Catch: all -> 0x0680, TryCatch #0 {all -> 0x0680, blocks: (B:129:0x03ba, B:131:0x03c7, B:133:0x03cd, B:151:0x049d, B:156:0x04df, B:158:0x04eb, B:160:0x04f6, B:159:0x04f2, B:152:0x04ad, B:154:0x04b9, B:155:0x04c5, B:135:0x03fd, B:137:0x0401, B:138:0x042c, B:140:0x0430, B:146:0x0479, B:145:0x045c, B:147:0x0482, B:149:0x048a, B:161:0x052d, B:162:0x054a, B:165:0x0550, B:167:0x056c, B:169:0x057f, B:172:0x0590, B:173:0x059f), top: B:266:0x03ba }] */
    @Override // defpackage.gfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gez b(defpackage.dfw r48, defpackage.dlj r49, defpackage.cjv r50, boolean r51, defpackage.bux r52, int r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfg.b(dfw, dlj, cjv, boolean, bux, int):gez");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfg)) {
            return false;
        }
        gfg gfgVar = (gfg) obj;
        int i = gfgVar.d;
        return affa.f(this.a, gfgVar.a) && affa.f(this.c, gfgVar.c);
    }

    public final int hashCode() {
        return (((this.a != null ? r0.hashCode() : 0) - 31) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        gcs gcsVar = this.a;
        return (gcsVar == null || (str = (String) woy.bH(gcsVar.a)) == null) ? "" : str;
    }
}
