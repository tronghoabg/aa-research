package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
final class aghd implements afec {
    final /* synthetic */ aghg this$1;
    final /* synthetic */ aghh val$this$0;

    public aghd(aghg aghgVar, aghh aghhVar) {
        this.this$1 = aghgVar;
        this.val$this$0 = aghhVar;
    }

    @Override // defpackage.afec
    public Collection<? extends agdn> invoke(ahnj ahnjVar) {
        return this.this$1.computeProperties(ahnjVar);
    }
}
