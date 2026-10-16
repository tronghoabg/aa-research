package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class rxl extends sss {
    public final ypf a;
    public final Context b;
    public final rxo c;
    public String d;
    private boolean e;
    private final Executor f;

    public rxl(Looper looper, Context context, Executor executor, rxo rxoVar) {
        super(looper);
        this.a = ols.R("GH.BR.HANDLER");
        this.b = context;
        this.f = executor;
        this.c = rxoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iAt;
        if (!this.e && message.what != 2) {
            this.a.g().ai(8489).u("Not running, returning");
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.a.l().ai(8494).y("Capturing start log for session %s", this.d);
                try {
                    this.c.b(String.format("session_%s_start", this.d), false);
                } catch (IOException e) {
                    this.a.g().p(e).ai(8495).y("Failed to create bug report for session %s start", this.d);
                }
                this.e = true;
                return;
            }
            if (i != 3) {
                this.a.g().ai(8488).u("Unexpected message");
                return;
            }
            try {
                this.c.b(String.format("session_%s_end", this.d), false);
            } catch (IOException e2) {
                this.a.g().p(e2).ai(8496).y("Failed to create bug report for session %s end", this.d);
            }
            this.a.l().ai(8490).u("Processing shutdown.");
            this.e = false;
            this.f.execute(new rnq(this, 11));
            return;
        }
        removeMessages(1);
        Context context = this.b;
        ypf ypfVar = rxf.a;
        aboh<oky> abohVar = rxi.r(context).b;
        ypf ypfVar2 = this.a;
        ypfVar2.l().ai(8486).w("Processing list of %d issues.", abohVar.size());
        for (oky okyVar : abohVar) {
            int iAt2 = a.at(okyVar.i);
            if (iAt2 == 0) {
                iAt2 = 1;
            }
            if (iAt2 == 3) {
                UUID uuidFromString = UUID.fromString(okyVar.c);
                oky okyVarG = rxf.g(context, uuidFromString);
                if (okyVarG == null) {
                    ypfVar2.l().ai(8493).u("Issue no longer exists, ignoring update.");
                } else {
                    yop yopVarAi = ypfVar2.l().ai(8491);
                    yxo yxoVarB = yxo.b(okyVarG.d);
                    if (yxoVarB == null) {
                        yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
                    }
                    yopVarAi.M("Processing bug report for issue type %s (uuid: %s).", yxoVarB.name(), uuidFromString);
                    if (okyVarG.j || (iAt = a.at(okyVarG.i)) == 0 || iAt != 3) {
                        ypfVar2.l().ai(8492).y("Issue %s updated before processing and no longer requires a Bug Report.", uuidFromString);
                    } else {
                        ypfVar2.l().ai(8485).y("Preparing for bug report for issue %s.", okyVarG.c);
                        if (okyVarG.e.isEmpty()) {
                            abnp abnpVarK = okyVarG.K();
                            String str = this.d;
                            abnpVarK.t();
                            oky okyVar2 = (oky) abnpVarK.b;
                            str.getClass();
                            okyVar2.b |= 4;
                            okyVar2.e = str;
                            okyVarG = (oky) abnpVarK.q();
                        }
                        this.f.execute(new rpo(this, rxf.n(context, okyVarG, 4), 11));
                    }
                }
            }
        }
    }
}
