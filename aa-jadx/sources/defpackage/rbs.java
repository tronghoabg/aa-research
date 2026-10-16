package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbs extends android.content.ContextWrapper {
    private android.content.Context a;
    private final android.content.Context b;

    public rbs(android.content.Context context) {
        super(context);
        this.a = context;
        this.b = context;
    }

    public final synchronized void a(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(this.a.getResources().getConfiguration());
        configuration2.updateFrom(configuration);
        android.content.res.Resources.Theme theme = this.a.getTheme();
        android.content.Context contextCreateConfigurationContext = this.a.createConfigurationContext(configuration2);
        this.a = contextCreateConfigurationContext;
        contextCreateConfigurationContext.getTheme().setTo(theme);
        this.a.getResources().updateConfiguration(configuration2, displayMetrics);
        this.b.getResources().updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized android.content.Context createConfigurationContext(android.content.res.Configuration configuration) {
        return this.a.createConfigurationContext(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized android.content.Context createDisplayContext(android.view.Display display) {
        return this.a.createDisplayContext(display);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized android.content.res.Resources getResources() {
        return this.a.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized android.content.res.Resources.Theme getTheme() {
        return this.a.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void setTheme(int i) {
        super.setTheme(i);
        this.a.setTheme(i);
    }
}
