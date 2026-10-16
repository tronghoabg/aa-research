package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class frc {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public int g;
    final /* synthetic */ frf h;
    public nbu i;

    public frc(frf frfVar, String str) {
        str.getClass();
        this.h = frfVar;
        this.a = str;
        this.b = new long[2];
        this.c = new ArrayList(2);
        this.d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.h.a.h(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.h.a.h(sb.toString()));
            sb.setLength(length);
        }
    }

    public final void a(ajmz ajmzVar) throws IOException {
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= 2) {
                return;
            }
            long j = jArr[i];
            ajmzVar.W(32);
            ajmzVar.Y(j);
            i++;
        }
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.f = true;
    }
}
