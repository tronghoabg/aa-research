package Cd;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class s0 extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2176a;

    public /* synthetic */ s0(int i5) {
        this.f2176a = i5;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f2176a) {
            case 10:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(String str, int i5) {
        super(str);
        this.f2176a = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(String str, boolean z2) {
        super(str);
        this.f2176a = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Throwable th) {
        super(th);
        this.f2176a = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(String message) {
        super(message);
        this.f2176a = 5;
        AbstractC3340k.e(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Gd.a response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        this.f2176a = 0;
        AbstractC3340k.e(response, "response");
        AbstractC3340k.e(cachedResponseText, "cachedResponseText");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(String taskName, Throwable th, int i5) {
        super(taskName, th);
        this.f2176a = i5;
        switch (i5) {
            case 9:
                AbstractC3340k.e(taskName, "taskName");
                super("Concurrent " + taskName + " attempts", th);
                break;
            default:
                break;
        }
    }
}
