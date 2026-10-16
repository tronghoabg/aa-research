package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
final class aiut extends aiuv {
    final /* synthetic */ aiux a;
    private final aitf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiut(aiux aiuxVar, long j, aitf aitfVar) {
        super(j);
        this.a = aiuxVar;
        this.c = aitfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this.a, afak.a);
    }

    @Override // defpackage.aiuv
    public final String toString() {
        String string = super.toString();
        aitf aitfVar = this.c;
        Objects.toString(aitfVar);
        return string.concat(aitfVar.toString());
    }
}
