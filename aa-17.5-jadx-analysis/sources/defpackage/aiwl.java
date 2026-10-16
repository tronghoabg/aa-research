package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class aiwl extends CancellationException implements aitr {
    public final transient aivh a;

    public aiwl(String str, aivh aivhVar) {
        super(str);
        this.a = aivhVar;
    }

    @Override // defpackage.aitr
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        aiwl aiwlVar = new aiwl(message, this.a);
        aiwlVar.initCause(this);
        return aiwlVar;
    }
}
