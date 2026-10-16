package Re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class G implements Le.b {

    /* renamed from: a, reason: collision with root package name */
    public static final G f10651a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ G[] f10652b;

    static {
        G g9 = new G("INSTANCE", 0);
        f10651a = g9;
        f10652b = new G[]{g9};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f10652b.clone();
    }

    @Override // Le.b, Q1.c
    public final void accept(Object obj) {
        ((ug.b) obj).request(Long.MAX_VALUE);
    }
}
