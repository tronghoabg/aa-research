package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rss {
    public static final defpackage.rss a;
    public static final defpackage.rss b;
    public static final defpackage.rss c;
    public static final defpackage.rss d;
    public static final defpackage.rss e;
    private static final /* synthetic */ defpackage.rss[] f;

    static {
        defpackage.rss rssVar = new defpackage.rss("FIRST_ACTIVITY_CLASS_LOADED", 0);
        a = rssVar;
        defpackage.rss rssVar2 = new defpackage.rss("FACET_BAR_FIRST_RESUME", 1);
        b = rssVar2;
        defpackage.rss rssVar3 = new defpackage.rss("CAR_SERVICE_VIDEO_FOCUS_GAINED", 2);
        c = rssVar3;
        defpackage.rss rssVar4 = new defpackage.rss("PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START", 3);
        d = rssVar4;
        defpackage.rss rssVar5 = new defpackage.rss("PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME", 4);
        e = rssVar5;
        f = new defpackage.rss[]{rssVar, rssVar2, rssVar3, rssVar4, rssVar5};
    }

    public static defpackage.rss valueOf(java.lang.String str) {
        return (defpackage.rss) java.lang.Enum.valueOf(defpackage.rss.class, str);
    }

    public static defpackage.rss[] values() {
        return (defpackage.rss[]) f.clone();
    }
}
