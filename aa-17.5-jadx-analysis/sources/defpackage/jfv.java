package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class jfv extends jfw {
    public static final yph a = yph.c("CAR.WIFILOG");
    public BufferedWriter b;
    public volatile boolean c;
    public int d;
    public final ArrayList e;
    private final Context f;
    private final jfu g;

    public jfv(Context context) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        jfu jfuVar = new jfu();
        this.g = jfuVar;
        this.f = context;
        try {
            this.b = new BufferedWriter(new FileWriter(new File(Environment.getExternalStorageDirectory(), "/gearhead_wifi_logs.txt"), false));
            this.d = 10000;
            this.c = true;
            arrayList.add(jfuVar);
            arrayList.add(new jft(context));
        } catch (IOException e) {
            ((ype) ((ype) a.l().p(e)).ai((char) 2005)).u("couldn't open log file for write");
        }
    }

    @Override // defpackage.jfw, defpackage.jdr
    public final void e() {
        this.g.f.incrementAndGet();
    }

    @Override // defpackage.jfw, defpackage.jdr
    public final void f(long j, long j2) {
        long j3 = j / 1000;
        jfu jfuVar = this.g;
        if (j3 > 1000) {
            jfuVar.e.incrementAndGet();
        } else {
            jfuVar.d.addAndGet(j3);
            jfuVar.c.incrementAndGet();
        }
    }

    @Override // defpackage.jfw, defpackage.jdr
    public final void g(int i) {
        this.g.h.addAndGet(i / 1000);
    }

    @Override // defpackage.jfw, defpackage.jdr
    public final void k(int i) {
        jfu jfuVar = this.g;
        jfuVar.b.incrementAndGet();
        jfuVar.g.addAndGet(i);
    }

    @Override // defpackage.jfw, defpackage.jdr
    public final void r() throws IOException {
        this.c = false;
        try {
            this.b.close();
        } catch (IOException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2008)).u("Error closing log file writer");
        }
    }

    @Override // defpackage.jfw, defpackage.jen
    public final void x(ScheduledExecutorService scheduledExecutorService) {
        if (this.c) {
            y("1 | CONNECTED, STARTING PROJECTION \n");
            new Thread(new ire(this, 17)).start();
        }
    }

    public final void y(String str) {
        try {
            this.b.append((CharSequence) str);
        } catch (IOException unused) {
            ((ype) a.l().ai((char) 2007)).u("couldn't write to log file");
        }
    }
}
