package android.support.v7.app;

import android.R;
import android.content.Context;
import android.support.v7.widget.bn;
import android.util.AttributeSet;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Constructor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AppCompatViewInflater {

    /* renamed from: a, reason: collision with root package name */
    private static final Class[] f493a = {Context.class, AttributeSet.class};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f494b = {R.attr.onClick};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f495c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d, reason: collision with root package name */
    private static final SimpleArrayMap f496d = new SimpleArrayMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object[] f497e = new Object[2];

    private final View g(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        SimpleArrayMap simpleArrayMap = f496d;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f493a);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f497e);
    }

    protected android.support.v7.widget.w a(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.w(context, attributeSet);
    }

    protected android.support.v7.widget.y b(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.y(context, attributeSet);
    }

    protected android.support.v7.widget.z c(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.z(context, attributeSet);
    }

    protected android.support.v7.widget.ap d(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.ap(context, attributeSet);
    }

    protected bn e(Context context, AttributeSet attributeSet) {
        return new bn(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f(java.lang.String r7, android.content.Context r8, android.util.AttributeSet r9) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater.f(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
