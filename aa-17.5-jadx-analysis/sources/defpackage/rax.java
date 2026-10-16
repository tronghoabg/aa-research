package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;

/* loaded from: classes.dex */
public final class rax extends ContextWrapper {
    private Context a;
    private final Context b;

    public rax(Context context) {
        super(context);
        this.a = context;
        this.b = context;
    }

    public final synchronized void a(Configuration configuration, DisplayMetrics displayMetrics) {
        Configuration configuration2 = new Configuration(this.a.getResources().getConfiguration());
        configuration2.updateFrom(configuration);
        Resources.Theme theme = this.a.getTheme();
        Context contextCreateConfigurationContext = this.a.createConfigurationContext(configuration2);
        this.a = contextCreateConfigurationContext;
        contextCreateConfigurationContext.getTheme().setTo(theme);
        this.a.getResources().updateConfiguration(configuration2, displayMetrics);
        this.b.getResources().updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized Context createConfigurationContext(Configuration configuration) {
        return this.a.createConfigurationContext(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized Context createDisplayContext(Display display) {
        return this.a.createDisplayContext(display);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized Resources getResources() {
        return this.a.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized Resources.Theme getTheme() {
        return this.a.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void setTheme(int i) {
        super.setTheme(i);
        this.a.setTheme(i);
    }
}
