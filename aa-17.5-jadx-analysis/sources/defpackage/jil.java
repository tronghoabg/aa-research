package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import java.util.Map;

/* loaded from: classes.dex */
public final class jil extends rbj {
    public final jim a;

    public jil(jim jimVar) {
        super(null, Looper.getMainLooper());
        this.a = jimVar;
    }

    public final void a(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        boolean z;
        yph yphVar = jim.a;
        ((ype) yphVar.l().ai((char) 2163)).y("WindowAnimationHandler.requestStartChoreographedWindowAnimation(%s)", projectionWindowAnimationChoreography);
        jim jimVar = this.a;
        synchronized (jimVar) {
            yno it = projectionWindowAnimationChoreography.a().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getValue()).intValue() == 0 && !jimVar.e.s(entry.getKey())) {
                    ((ype) yphVar.l().ai(2162)).M("Waiting on %s enter to complete %s", entry.getKey(), projectionWindowAnimationChoreography);
                } else if (((Integer) entry.getValue()).intValue() == 1 && !jimVar.d.s(entry.getKey())) {
                    ((ype) yphVar.l().ai(2161)).M("Waiting on %s removal to complete %s", entry.getKey(), projectionWindowAnimationChoreography);
                }
                z = false;
            }
            z = true;
        }
        if (z) {
            ((ype) jim.a.l().ai((char) 2166)).u("WindowAnimationHandler start choreography immediately.");
            removeMessages(2, projectionWindowAnimationChoreography);
            sendMessage(obtainMessage(2, projectionWindowAnimationChoreography));
        } else if (hasMessages(2, projectionWindowAnimationChoreography)) {
            ((ype) jim.a.l().ai((char) 2165)).u("Choreography scheduled");
        } else {
            ((ype) jim.a.l().ai((char) 2164)).u("WindowAnimationHandler post message with delay.");
            sendMessageDelayed(obtainMessage(2, 1, 0, projectionWindowAnimationChoreography), acnp.b());
        }
    }

    public final void b() {
        boolean z;
        ((ype) jim.a.l().ai((char) 2167)).u("WindowAnimationHandler.requestStartContentWindowAnimation()");
        jim jimVar = this.a;
        synchronized (jimVar) {
            z = false;
            if (!jimVar.b.isEmpty() && !jimVar.c.isEmpty()) {
                z = true;
            }
        }
        if (z) {
            ((ype) jim.a.l().ai((char) 2170)).u("WindowAnimationHandler post message.");
            removeMessages(1);
            sendMessage(obtainMessage(1));
        } else if (hasMessages(1)) {
            ((ype) jim.a.l().ai((char) 2169)).u("WindowAnimationHandler scheduled");
        } else {
            ((ype) jim.a.l().ai((char) 2168)).u("WindowAnimationHandler post message with delay.");
            sendMessageDelayed(obtainMessage(1), acnp.b());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            jim jimVar = this.a;
            yph yphVar = jim.a;
            jimVar.J();
        } else {
            if (i != 2) {
                return;
            }
            ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (ProjectionWindowAnimationChoreography) message.obj;
            jim jimVar2 = this.a;
            boolean z = message.arg1 == 1;
            yph yphVar2 = jim.a;
            jimVar2.I(z, projectionWindowAnimationChoreography);
        }
    }
}
