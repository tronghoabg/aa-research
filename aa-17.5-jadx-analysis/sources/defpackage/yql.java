package defpackage;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class yql {
    public static final yqn a = a(yqn.d);

    private static yqn a(String[] strArr) {
        yqv yqvVar;
        try {
            yqvVar = yqw.a;
        } catch (NoClassDefFoundError unused) {
            yqvVar = null;
        }
        if (yqvVar != null) {
            return yqvVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (yqn) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
