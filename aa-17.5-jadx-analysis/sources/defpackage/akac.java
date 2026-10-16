package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class akac extends ajzw implements ajpj {
    public ajpb a;
    private final ajpt b;
    private final int c;
    private final String f;
    private final Locale g;
    private akai h;

    public akac(akai akaiVar, Locale locale) {
        this.h = akaiVar;
        this.b = akaiVar.a;
        this.c = akaiVar.b;
        this.f = akaiVar.c;
        this.g = locale;
    }

    @Override // defpackage.ajpj
    public final ajpb a() {
        return this.a;
    }

    @Override // defpackage.ajpj
    public final void b(ajpb ajpbVar) {
        this.a = ajpbVar;
    }

    @Override // defpackage.ajpg
    public final ajpt d() {
        throw null;
    }

    @Override // defpackage.ajpj
    public final akai p() {
        akai akaiVar = this.h;
        if (akaiVar != null) {
            return akaiVar;
        }
        ajpt ajptVar = this.b;
        int i = this.c;
        String str = this.f;
        if (str == null) {
            if (this.g == null) {
                Locale.getDefault();
            }
            boolean z = false;
            if (i >= 100 && i < 600) {
                z = true;
            }
            ahgm.a(z, a.bp(i, "Unknown category for status code "));
            int i2 = i / 100;
            int i3 = i2 * 100;
            String[] strArr = ajvf.b[i2];
            int i4 = i - i3;
            str = strArr.length > i4 ? strArr[i4] : null;
        }
        akai akaiVar2 = new akai(ajptVar, i, str);
        this.h = akaiVar2;
        return akaiVar2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p());
        sb.append(' ');
        sb.append(this.d);
        if (this.a != null) {
            sb.append(' ');
            sb.append(this.a);
        }
        return sb.toString();
    }
}
