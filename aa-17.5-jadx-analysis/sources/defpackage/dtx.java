package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class dtx {
    static Notification.ProgressStyle.Point a(dtz dtzVar) {
        return new Notification.ProgressStyle.Point(dtzVar.a).setColor(dtzVar.c).setId(dtzVar.b);
    }

    static Notification.ProgressStyle.Segment b(dua duaVar) {
        return new Notification.ProgressStyle.Segment(duaVar.a).setColor(duaVar.c).setId(duaVar.b);
    }

    static void c(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    static void d(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    static void e(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    static void f(Notification.ProgressStyle progressStyle, List<dtz> list) {
        Iterator<dtz> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(a(it.next()));
        }
    }

    static void g(Notification.ProgressStyle progressStyle, List<dua> list) {
        Iterator<dua> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(b(it.next()));
        }
    }

    static void h(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    static void i(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    static void j(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static final eqj l(aiyk aiykVar, afco afcoVar, long j) {
        aiykVar.getClass();
        eqj eqjVarP = p(afcoVar, j, new epm(aiykVar, (afck) null, 0));
        if (aiykVar instanceof aizz) {
            if (pk.bn().bo()) {
                eqjVarP.m(((aizz) aiykVar).b());
                return eqjVarP;
            }
            eqjVarP.j(((aizz) aiykVar).b());
        }
        return eqjVarP;
    }

    public static final aiyk m(eqj eqjVar) {
        eqjVar.getClass();
        return aimv.b(new aiyd(new dmx(eqjVar, (afck) null, 4)), -1);
    }

    public static /* synthetic */ eqj n(aiyk aiykVar, Duration duration) {
        afcp afcpVar = afcp.a;
        aiykVar.getClass();
        duration.getClass();
        return l(aiykVar, afcpVar, duration.toMillis());
    }

    public static final eqj p(afco afcoVar, long j, afeg afegVar) {
        afcoVar.getClass();
        return new epe(afcoVar, j, afegVar);
    }
}
