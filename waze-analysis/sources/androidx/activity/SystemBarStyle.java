package androidx.activity;

import android.content.res.Resources;
import androidx.activity.SystemBarStyle;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final l<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i2, int i3, int i4, l<? super Resources, Boolean> lVar) {
        this.lightScrim = i2;
        this.darkScrim = i3;
        this.nightMode = i4;
        this.detectDarkMode = lVar;
    }

    public static final SystemBarStyle auto(int i2, int i3) {
        return Companion.auto(i2, i3);
    }

    public static final SystemBarStyle dark(int i2) {
        return Companion.dark(i2);
    }

    public static final SystemBarStyle light(int i2, int i3) {
        return Companion.light(i2, i3);
    }

    public final int getDarkScrim$activity() {
        return this.darkScrim;
    }

    public final l<Resources, Boolean> getDetectDarkMode$activity() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity() {
        return this.nightMode;
    }

    public final int getScrim$activity(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i2, int i3, l lVar, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                lVar = new l() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(SystemBarStyle.Companion.auto$lambda$0((Resources) obj2));
                    }
                };
            }
            return companion.auto(i2, i3, lVar);
        }

        static final boolean auto$lambda$0(Resources resources) {
            x.f(resources, "resources");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        static final boolean dark$lambda$0(Resources resources) {
            x.f(resources, "<unused var>");
            return true;
        }

        static final boolean light$lambda$0(Resources resources) {
            x.f(resources, "<unused var>");
            return false;
        }

        public final SystemBarStyle auto(int i2, int i3, l<? super Resources, Boolean> lVar) {
            x.f(lVar, "detectDarkMode");
            return new SystemBarStyle(i2, i3, 0, lVar, null);
        }

        public final SystemBarStyle dark(int i2) {
            return new SystemBarStyle(i2, i2, 2, new l() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    SystemBarStyle.Companion.dark$lambda$0((Resources) obj);
                    return true;
                }
            }, null);
        }

        public final SystemBarStyle light(int i2, int i3) {
            return new SystemBarStyle(i2, i3, 1, new l() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    SystemBarStyle.Companion.light$lambda$0((Resources) obj);
                    return false;
                }
            }, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final SystemBarStyle auto(int i2, int i3) {
            return auto$default(this, i2, i3, null, 4, null);
        }
    }

    public static final SystemBarStyle auto(int i2, int i3, l<? super Resources, Boolean> lVar) {
        return Companion.auto(i2, i3, lVar);
    }

    public /* synthetic */ SystemBarStyle(int i2, int i3, int i4, l lVar, o oVar) {
        this(i2, i3, i4, lVar);
    }
}
