package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjb implements defpackage.fja {
    private final /* synthetic */ int c;
    public static final defpackage.fjb b = new defpackage.fjb(1);
    public static final defpackage.fjb a = new defpackage.fjb(0);

    private fjb(int i) {
        this.c = i;
    }

    @Override // defpackage.fja
    public final float a(android.content.Context context) {
        return this.c != 0 ? ((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getDensity() : context.getResources().getDisplayMetrics().density;
    }
}
