package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pl extends android.content.ContextWrapper {
    private static android.content.res.Configuration b;
    public int a;
    private android.content.res.Resources.Theme c;
    private android.view.LayoutInflater d;
    private android.content.res.Configuration e;
    private android.content.res.Resources f;

    public pl(android.content.Context context, int i) {
        super(context);
        this.a = i;
    }

    private final void c() {
        if (this.c == null) {
            this.c = a().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final android.content.res.Resources a() {
        android.content.res.Resources resources = this.f;
        if (resources != null) {
            return resources;
        }
        android.content.res.Configuration configuration = this.e;
        if (configuration != null) {
            android.content.res.Configuration configuration2 = b;
            if (configuration2 == null) {
                configuration2 = new android.content.res.Configuration();
                configuration2.fontScale = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                b = configuration2;
            }
            if (!configuration.equals(configuration2)) {
                android.content.res.Resources resources2 = createConfigurationContext(this.e).getResources();
                this.f = resources2;
                return resources2;
            }
        }
        android.content.res.Resources resources3 = super.getResources();
        this.f = resources3;
        return resources3;
    }

    public final void b(android.content.res.Configuration configuration) {
        if (this.f != null) {
            throw new java.lang.IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.e != null) {
            throw new java.lang.IllegalStateException("Override configuration has already been set");
        }
        this.e = new android.content.res.Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
        return a().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        android.view.LayoutInflater layoutInflater = this.d;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflaterCloneInContext = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.d = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = com.google.android.projection.gearhead.R.style.Theme_AppCompat_Light;
        }
        c();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public pl() {
        super(null);
    }

    public pl(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.c = theme;
    }
}
