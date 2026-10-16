package androidx.compose.ui.semantics;

import h.g.a.p;
import h.g.b.ad;
import h.g.b.y;
import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new ad(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName();
    }

    public static final <T> SemanticsPropertyKey<T> SemanticsPropertyKey(String str, String str2, p<? super T, ? super T, ? extends T> pVar) {
        return new SemanticsPropertyKey<>(str, false, (p) pVar, str2);
    }

    public static /* synthetic */ SemanticsPropertyKey SemanticsPropertyKey$default(String str, String str2, p pVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            pVar = AnonymousClass1.INSTANCE;
        }
        return SemanticsPropertyKey(str, str2, pVar);
    }

    public static final String getAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], str);
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsProperties_androidKt$SemanticsPropertyKey$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return obj;
        }
    }
}
