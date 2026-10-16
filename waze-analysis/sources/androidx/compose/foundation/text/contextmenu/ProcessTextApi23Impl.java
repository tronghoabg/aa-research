package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.TextRange;
import androidx.webkit.internal.AssetHelper;
import h.ab;
import h.g.a.l;
import h.g.a.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ProcessTextApi23Impl {
    public static final ProcessTextApi23Impl INSTANCE = new ProcessTextApi23Impl();
    private static l<? super Context, ? extends List<? extends ResolveInfo>> processTextActivitiesQuery = new l() { // from class: androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ProcessTextApi23Impl.processTextActivitiesQuery$lambda$0((Context) obj);
        }
    };
    private static s<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super TextRange, ab> onClickProcessTextItem = new s() { // from class: androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl$$ExternalSyntheticLambda1
        @Override // h.g.a.s
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (TextRange) obj5);
        }
    };
    public static final int $stable = 8;

    private ProcessTextApi23Impl() {
    }

    private final Intent createProcessTextIntent() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE);
    }

    private final boolean hasPermission(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || hasPermission(resolveInfo.activityInfo, context);
    }

    static final ab onClickProcessTextItem$lambda$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, TextRange textRange) {
        String string = charSequence.subSequence(TextRange.m10544getMinimpl(textRange.m10550unboximpl()), TextRange.m10543getMaximpl(textRange.m10550unboximpl())).toString();
        Intent intentCreateProcessTextIntentForResolveInfo = INSTANCE.createProcessTextIntentForResolveInfo(resolveInfo, z);
        intentCreateProcessTextIntentForResolveInfo.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentCreateProcessTextIntentForResolveInfo);
        return ab.f48028a;
    }

    static final List processTextActivitiesQuery$lambda$0(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.createProcessTextIntent(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i2 = 0; i2 < size; i2++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
            if (INSTANCE.hasPermission(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, boolean z) {
        return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
    }

    public final s<Context, ResolveInfo, Boolean, CharSequence, TextRange, ab> getOnClickProcessTextItem() {
        return onClickProcessTextItem;
    }

    public final l<Context, List<ResolveInfo>> getProcessTextActivitiesQuery() {
        return processTextActivitiesQuery;
    }

    public final List<ResolveInfo> queryProcessTextActivities(Context context) {
        return (List) processTextActivitiesQuery.invoke(context);
    }

    public final void setOnClickProcessTextItem(s<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super TextRange, ab> sVar) {
        onClickProcessTextItem = sVar;
    }

    public final void setProcessTextActivitiesQuery(l<? super Context, ? extends List<? extends ResolveInfo>> lVar) {
        processTextActivitiesQuery = lVar;
    }

    public static /* synthetic */ void getOnClickProcessTextItem$annotations() {
    }

    public static /* synthetic */ void getProcessTextActivitiesQuery$annotations() {
    }

    private final boolean hasPermission(ActivityInfo activityInfo, Context context) {
        if (activityInfo.exported) {
            return activityInfo.permission == null || context.checkSelfPermission(activityInfo.permission) == 0;
        }
        return false;
    }
}
