package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: q.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3836s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f43895a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f43895a = declaredField;
    }
}
