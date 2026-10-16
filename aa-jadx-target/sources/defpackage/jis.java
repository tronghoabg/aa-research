package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jis extends defpackage.rce {
    public final defpackage.jit a;

    public jis(defpackage.jit jitVar) {
        super(null, android.os.Looper.getMainLooper());
        this.a = jitVar;
    }

    public final void a(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        boolean z;
        defpackage.yqm yqmVar = defpackage.jit.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2164)).y("WindowAnimationHandler.requestStartChoreographedWindowAnimation(%s)", projectionWindowAnimationChoreography);
        defpackage.jit jitVar = this.a;
        synchronized (jitVar) {
            defpackage.yot it = projectionWindowAnimationChoreography.a().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Integer) entry.getValue()).intValue() == 0 && !jitVar.e.s(entry.getKey())) {
                    ((defpackage.yqj) yqmVar.l().ai(2163)).M("Waiting on %s enter to complete %s", entry.getKey(), projectionWindowAnimationChoreography);
                } else if (((java.lang.Integer) entry.getValue()).intValue() == 1 && !jitVar.d.s(entry.getKey())) {
                    ((defpackage.yqj) yqmVar.l().ai(2162)).M("Waiting on %s removal to complete %s", entry.getKey(), projectionWindowAnimationChoreography);
                }
                z = false;
                break;
            }
        }
        if (z) {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2167)).u("WindowAnimationHandler start choreography immediately.");
            removeMessages(2, projectionWindowAnimationChoreography);
            sendMessage(obtainMessage(2, projectionWindowAnimationChoreography));
        } else if (hasMessages(2, projectionWindowAnimationChoreography)) {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2166)).u("Choreography scheduled");
        } else {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2165)).u("WindowAnimationHandler post message with delay.");
            sendMessageDelayed(obtainMessage(2, 1, 0, projectionWindowAnimationChoreography), defpackage.acor.b());
        }
    }

    public final void b() {
        boolean z;
        ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2168)).u("WindowAnimationHandler.requestStartContentWindowAnimation()");
        defpackage.jit jitVar = this.a;
        synchronized (jitVar) {
            z = false;
            if (!jitVar.b.isEmpty() && !jitVar.c.isEmpty()) {
                z = true;
            }
        }
        if (z) {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2171)).u("WindowAnimationHandler post message.");
            removeMessages(1);
            sendMessage(obtainMessage(1));
        } else if (hasMessages(1)) {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2170)).u("WindowAnimationHandler scheduled");
        } else {
            ((defpackage.yqj) defpackage.jit.a.l().ai((char) 2169)).u("WindowAnimationHandler post message with delay.");
            sendMessageDelayed(obtainMessage(1), defpackage.acor.b());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            defpackage.jit jitVar = this.a;
            defpackage.yqm yqmVar = defpackage.jit.a;
            jitVar.J();
        } else {
            if (i != 2) {
                return;
            }
            com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) message.obj;
            defpackage.jit jitVar2 = this.a;
            boolean z = message.arg1 == 1;
            defpackage.yqm yqmVar2 = defpackage.jit.a;
            jitVar2.I(z, projectionWindowAnimationChoreography);
        }
    }
}
