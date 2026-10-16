package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class oa {
    private static uef uef;

    /* renamed from: com.bytedance.sdk.component.utils.oa$oa, reason: collision with other inner class name */
    public interface InterfaceC0066oa {
        void uef();

        void uef(Throwable th);
    }

    public interface uef {
        boolean oa();

        boolean uef();

        ExecutorService yo();
    }

    public static void uef(uef uefVar) {
        uef = uefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean yo(Context context, Intent intent, InterfaceC0066oa interfaceC0066oa) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0066oa == null) {
                    return true;
                }
                interfaceC0066oa.uef();
                return true;
            } catch (Throwable th) {
                if (interfaceC0066oa != null) {
                    interfaceC0066oa.uef(th);
                }
            }
        }
        return false;
    }

    public static void uef(final Context context, final Intent intent, final InterfaceC0066oa interfaceC0066oa) {
        ExecutorService executorServiceYo;
        uef uefVar = uef;
        if (uefVar == null || !uefVar.oa() || (executorServiceYo = uef.yo()) == null) {
            yo(context, intent, interfaceC0066oa);
        } else {
            executorServiceYo.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.oa.1
                @Override // java.lang.Runnable
                public void run() {
                    oa.yo(context, intent, interfaceC0066oa);
                }
            });
        }
    }

    public static boolean uef(final Context context, final Intent intent, final InterfaceC0066oa interfaceC0066oa, boolean z2) {
        uef uefVar;
        ExecutorService executorServiceYo;
        if (z2 && (uefVar = uef) != null && uefVar.uef() && (executorServiceYo = uef.yo()) != null) {
            executorServiceYo.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.oa.2
                @Override // java.lang.Runnable
                public void run() {
                    oa.yo(context, intent, interfaceC0066oa);
                }
            });
            return true;
        }
        return yo(context, intent, interfaceC0066oa);
    }

    public static Activity uef(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean uef(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
