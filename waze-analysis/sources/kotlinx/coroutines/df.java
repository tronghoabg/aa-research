package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class df extends CancellationException implements x {

    /* renamed from: a, reason: collision with root package name */
    public final transient br f51838a;

    public df(String str, br brVar) {
        super(str);
        this.f51838a = brVar;
    }

    @Override // kotlinx.coroutines.x
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        df dfVar = new df(message, this.f51838a);
        dfVar.initCause(this);
        return dfVar;
    }
}
