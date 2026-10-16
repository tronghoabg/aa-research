package defpackage;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager$Callback;
import android.content.IntentSender;

/* loaded from: classes.dex */
public final class jlx extends CompanionDeviceManager$Callback {
    final /* synthetic */ jmc a;
    final /* synthetic */ jme b;
    final /* synthetic */ jlr c;

    public jlx(jmc jmcVar, jme jmeVar, jlr jlrVar) {
        this.a = jmcVar;
        this.b = jmeVar;
        this.c = jlrVar;
    }

    public final void onAssociationCreated(AssociationInfo associationInfo) {
        associationInfo.getClass();
        jlw jlwVar = jme.a;
        jmc jmcVar = this.a;
        String strC = jlw.c(associationInfo, jmcVar.a);
        int id = associationInfo.getId();
        if (id <= 0) {
            throw new IllegalArgumentException("Association ID must be positive.");
        }
        if (jmcVar.b != 0) {
            throw new IllegalStateException("Cannot set association ID more than once.");
        }
        jmcVar.b = id;
        ((ype) jme.b.f()).K("Associated device %s (%s).", strC, id);
        dsg.E(this.b.i, yzy.Fn);
        jmcVar.c(jmd.b);
        jmcVar.b(this.c);
    }

    public final void onAssociationPending(IntentSender intentSender) {
        intentSender.getClass();
        onFailure("Association confirmation dialog unexpectedly shown!");
    }

    public final void onFailure(CharSequence charSequence) {
        ((ype) jme.b.g()).y("Unable to associate device! %s", charSequence);
        dsg.E(this.b.i, yzy.Fo);
        this.c.a(-1);
    }
}
