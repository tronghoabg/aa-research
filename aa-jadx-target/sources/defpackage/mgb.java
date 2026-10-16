package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class mgb extends android.support.v4.app.Fragment {
    public final android.os.Handler a;
    public final java.lang.Runnable b;
    private final defpackage.eqe c;

    public mgb(int i) {
        super(i);
        this.a = new android.os.Handler(android.os.Looper.getMainLooper());
        this.b = new defpackage.jpa(this, 12);
        this.c = new defpackage.mga(this, 0);
    }

    public abstract void a(android.view.View view);

    @Override // android.support.v4.app.Fragment
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!defpackage.lee.a.a().b()) {
            return layoutInflaterOnGetLayoutInflater;
        }
        android.content.Context context = layoutInflaterOnGetLayoutInflater.getContext();
        context.getClass();
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new defpackage.pl(context, defpackage.ebo.o()));
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        a(view);
        getLifecycle().c(this.c);
    }
}
