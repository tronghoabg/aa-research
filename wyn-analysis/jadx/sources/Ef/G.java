package Ef;

/* loaded from: classes5.dex */
public final class G extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(int i5) {
        super("An operation is not implemented.");
        switch (i5) {
            case 2:
                super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
                break;
            default:
                break;
        }
    }
}
