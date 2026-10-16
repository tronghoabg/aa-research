package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class KeyFrames {
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> map = new HashMap<>();
        sKeyMakers = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(null));
            sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "unable to load", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KeyFrames(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "KeyFrames"
            r6.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r6.mFramesMap = r2
            int r2 = r8.getEventType()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r3 = 0
            r4 = r3
        L14:
            r5 = 1
            if (r2 == r5) goto Lda
            r5 = 2
            if (r2 == r5) goto L2d
            r5 = 3
            if (r2 == r5) goto L1f
            goto Ld4
        L1f:
            java.lang.String r2 = "KeyFrameSet"
            java.lang.String r5 = r8.getName()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            boolean r2 = r2.equals(r5)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r2 == 0) goto Ld4
            goto Lda
        L2d:
            java.lang.String r2 = r8.getName()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r5 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            boolean r5 = r5.containsKey(r2)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r5 == 0) goto Laf
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            switch(r4) {
                case -300573030: goto L7a;
                case -298435811: goto L6b;
                case 540053991: goto L5d;
                case 1153397896: goto L4f;
                case 1308496505: goto L41;
                default: goto L40;
            }
        L40:
            goto L93
        L41:
            java.lang.String r4 = "KeyTrigger"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyTrigger r2 = new androidx.constraintlayout.motion.widget.KeyTrigger     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r2.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto L78
        L4f:
            java.lang.String r4 = "KeyPosition"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyPosition r2 = new androidx.constraintlayout.motion.widget.KeyPosition     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r2.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto L78
        L5d:
            java.lang.String r4 = "KeyCycle"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyCycle r2 = new androidx.constraintlayout.motion.widget.KeyCycle     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r2.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto L78
        L6b:
            java.lang.String r4 = "KeyAttribute"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyAttributes r2 = new androidx.constraintlayout.motion.widget.KeyAttributes     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r2.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
        L78:
            r4 = r2
            goto L88
        L7a:
            java.lang.String r4 = "KeyTimeCycle"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyTimeCycle r2 = new androidx.constraintlayout.motion.widget.KeyTimeCycle     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r2.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto L78
        L88:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r8)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r4.load(r7, r2)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r6.addKey(r4)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto Ld4
        L93:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r7.<init>()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            java.lang.String r8 = "Key "
            r7.append(r8)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r7.append(r2)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            java.lang.String r8 = " not found"
            r7.append(r8)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            r6.<init>(r7)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            throw r6     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
        Laf:
            java.lang.String r5 = "CustomAttribute"
            boolean r5 = r2.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r5 == 0) goto Lc3
            if (r4 == 0) goto Lc1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r4.mCustomConstraints     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r2 == 0) goto Ld4
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r2)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto Ld4
        Lc1:
            r4 = r3
            goto Ld4
        Lc3:
            java.lang.String r5 = "CustomMethod"
            boolean r2 = r2.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r2 == 0) goto Ld4
            if (r4 == 0) goto Lc1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r4.mCustomConstraints     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            if (r2 == 0) goto Ld4
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r2)     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
        Ld4:
            int r2 = r8.next()     // Catch: java.io.IOException -> Ldb org.xmlpull.v1.XmlPullParserException -> Le0
            goto L14
        Lda:
            return
        Ldb:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return
        Le0:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyFrames.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    static String name(int i2, Context context) {
        return context.getResources().getResourceEntryName(i2);
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Key key = arrayList2.get(i2);
                if (key.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i2) {
        return this.mFramesMap.get(Integer.valueOf(i2));
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    public KeyFrames() {
    }
}
