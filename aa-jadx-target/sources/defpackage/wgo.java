package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgo {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(\\w+).*");

    public static java.lang.String a(java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new defpackage.xyj("+").b(list));
    }
}
