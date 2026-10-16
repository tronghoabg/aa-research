package x0;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import r7.AbstractC3935e;

/* renamed from: x0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4446p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f47639a;

    /* renamed from: b, reason: collision with root package name */
    public static final C4447q f47640b;

    /* renamed from: c, reason: collision with root package name */
    public static final C4447q f47641c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4447q f47642d;

    static {
        r rVar = new r("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        I i5 = H.f39741a;
        f47639a = new KProperty[]{i5.mutableProperty1(rVar), i5.mutableProperty1(new r("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;")), i5.mutableProperty1(new r("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), i5.mutableProperty1(new r("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), i5.mutableProperty1(new r("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), i5.mutableProperty1(new r("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), i5.mutableProperty1(new r("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), i5.mutableProperty1(new r("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), i5.mutableProperty1(new r("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), i5.mutableProperty1(new r("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;")), i5.mutableProperty1(new r("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J")), i5.mutableProperty1(new r("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), i5.mutableProperty1(new r("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), i5.mutableProperty1(new r("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;")), i5.mutableProperty1(new r("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;")), i5.mutableProperty1(new r("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;")), i5.mutableProperty1(new r("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"))};
        f47640b = AbstractC4444n.k;
        f47641c = AbstractC4444n.f47629o;
        f47642d = AbstractC4444n.f47630p;
        C4447q c4447q = AbstractC4436f.f47579a;
    }

    public static final void a(C4437g c4437g, String value) {
        AbstractC3340k.e(c4437g, "<this>");
        AbstractC3340k.e(value, "value");
        C4447q c4447q = AbstractC4444n.f47616a;
        c4437g.d(AbstractC4444n.f47616a, AbstractC3935e.C(value));
    }

    public static final void b(C4437g role, int i5) {
        AbstractC3340k.e(role, "$this$role");
        KProperty property = f47639a[7];
        C4435e c4435e = new C4435e(i5);
        C4447q c4447q = f47641c;
        c4447q.getClass();
        AbstractC3340k.e(property, "property");
        role.d(c4447q, c4435e);
    }

    public static final void c(C4437g c4437g, String str) {
        AbstractC3340k.e(c4437g, "<this>");
        AbstractC3340k.e(str, "<set-?>");
        KProperty property = f47639a[8];
        C4447q c4447q = f47642d;
        c4447q.getClass();
        AbstractC3340k.e(property, "property");
        c4437g.d(c4447q, str);
    }
}
