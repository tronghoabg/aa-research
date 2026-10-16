package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import h.g.b.o;
import java.lang.reflect.Constructor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {
    public static final Companion Companion = new Companion(null);
    private static boolean isInitialized;
    private static Constructor<StaticLayout> staticLayoutConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.StaticLayout create(androidx.compose.ui.text.android.StaticLayoutParams r19) {
        /*
            r18 = this;
            java.lang.String r0 = "unable to call constructor"
            java.lang.String r1 = "StaticLayoutFactory"
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault$Companion r2 = androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion
            java.lang.reflect.Constructor r2 = androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion.access$getStaticLayoutConstructor(r2)
            if (r2 == 0) goto Lb3
            java.lang.CharSequence r4 = r19.getText()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            int r5 = r19.getStart()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            int r6 = r19.getEnd()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            android.text.TextPaint r7 = r19.getPaint()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            int r8 = r19.getWidth()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            android.text.Layout$Alignment r9 = r19.getAlignment()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            android.text.TextDirectionHeuristic r10 = r19.getTextDir()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            float r11 = r19.getLineSpacingMultiplier()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            float r12 = r19.getLineSpacingExtra()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            boolean r13 = r19.getIncludePadding()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            android.text.TextUtils$TruncateAt r14 = r19.getEllipsize()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            int r15 = r19.getEllipsizedWidth()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            int r16 = r19.getMaxLines()     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.reflect.InvocationTargetException -> L9b java.lang.InstantiationException -> La3 java.lang.IllegalAccessException -> Lab
            r18 = 0
            r3 = 13
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r17 = 0
            r3[r17] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 1
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 2
            r3[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 3
            r3[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 4
            r3[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 5
            r3[r4] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 6
            r3[r4] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 7
            r3[r4] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 8
            r3[r4] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 9
            r3[r4] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 10
            r3[r4] = r14     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 11
            r3[r4] = r15     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r4 = 12
            r3[r4] = r16     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            android.text.StaticLayout r2 = (android.text.StaticLayout) r2     // Catch: java.lang.reflect.InvocationTargetException -> L9d java.lang.InstantiationException -> La5 java.lang.IllegalAccessException -> Lad
            r3 = r2
            goto Lb7
        L9b:
            r18 = 0
        L9d:
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor = r18
            android.util.Log.e(r1, r0)
            goto Lb5
        La3:
            r18 = 0
        La5:
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor = r18
            android.util.Log.e(r1, r0)
            goto Lb5
        Lab:
            r18 = 0
        Lad:
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor = r18
            android.util.Log.e(r1, r0)
            goto Lb5
        Lb3:
            r18 = 0
        Lb5:
            r3 = r18
        Lb7:
            if (r3 == 0) goto Lba
            return r3
        Lba:
            android.text.StaticLayout r4 = new android.text.StaticLayout
            java.lang.CharSequence r5 = r19.getText()
            int r6 = r19.getStart()
            int r7 = r19.getEnd()
            android.text.TextPaint r8 = r19.getPaint()
            int r9 = r19.getWidth()
            android.text.Layout$Alignment r10 = r19.getAlignment()
            float r11 = r19.getLineSpacingMultiplier()
            float r12 = r19.getLineSpacingExtra()
            boolean r13 = r19.getIncludePadding()
            android.text.TextUtils$TruncateAt r14 = r19.getEllipsize()
            int r15 = r19.getEllipsizedWidth()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.StaticLayoutFactoryDefault.create(androidx.compose.ui.text.android.StaticLayoutParams):android.text.StaticLayout");
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        return false;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (!StaticLayoutFactoryDefault.isInitialized) {
                StaticLayoutFactoryDefault.isInitialized = true;
                try {
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    StaticLayoutFactoryDefault.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                } catch (NoSuchMethodException unused) {
                    StaticLayoutFactoryDefault.staticLayoutConstructor = null;
                    Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
                }
            }
            return StaticLayoutFactoryDefault.staticLayoutConstructor;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
