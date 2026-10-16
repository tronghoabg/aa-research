package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes5.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final m reflectionAccessors = new m();
    private final SparseArray<n> flutterIdToOrigin = new SparseArray<>();
    private final Map<n, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i5) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r9, android.view.View r10, android.view.accessibility.AccessibilityNodeInfo r11) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = r1
        L3:
            int r3 = r9.getChildCount()
            if (r2 >= r3) goto L9a
            io.flutter.view.m r3 = r8.reflectionAccessors
            java.lang.reflect.Method r4 = r3.f37308f
            java.lang.reflect.Field r5 = r3.f37307e
            java.lang.reflect.Method r3 = r3.f37306d
            if (r3 != 0) goto L18
            if (r5 == 0) goto L62
            if (r4 != 0) goto L18
            goto L62
        L18:
            java.lang.String r6 = "AccessibilityBridge"
            if (r3 == 0) goto L3b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            r5[r1] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Object r3 = r3.invoke(r9, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
            goto L63
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            r3 = move-exception
            goto L35
        L2f:
            java.lang.String r4 = "The getChildId method threw an exception when invoked."
            android.util.Log.w(r6, r4, r3)
            goto L62
        L35:
            java.lang.String r4 = "Failed to access getChildId method."
            android.util.Log.w(r6, r4, r3)
            goto L62
        L3b:
            java.lang.Object r3 = r5.get(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            r7[r1] = r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object r3 = r4.invoke(r3, r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            r3.getClass()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            goto L63
        L51:
            r3 = move-exception
            goto L57
        L53:
            r3 = move-exception
            goto L57
        L55:
            r3 = move-exception
            goto L5d
        L57:
            java.lang.String r4 = "The longArrayGetIndex method threw an exception when invoked."
            android.util.Log.w(r6, r4, r3)
            goto L62
        L5d:
            java.lang.String r4 = "Failed to access longArrayGetIndex method or the childNodeId field."
            android.util.Log.w(r6, r4, r3)
        L62:
            r3 = 0
        L63:
            if (r3 != 0) goto L66
            goto L97
        L66:
            long r3 = r3.longValue()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            io.flutter.view.n r4 = new io.flutter.view.n
            r4.<init>(r10, r3)
            java.util.Map<io.flutter.view.n, java.lang.Integer> r5 = r8.originToFlutterId
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L88
            java.util.Map<io.flutter.view.n, java.lang.Integer> r3 = r8.originToFlutterId
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L92
        L88:
            int r4 = r8.nextFlutterId
            int r5 = r4 + 1
            r8.nextFlutterId = r5
            r8.cacheVirtualIdMappings(r10, r3, r4)
            r3 = r4
        L92:
            android.view.View r4 = r8.rootAccessibilityView
            r11.addChild(r4, r3)
        L97:
            int r2 = r2 + r0
            goto L3
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(View view, int i5, int i10) {
        n nVar = new n(view, i5);
        this.originToFlutterId.put(nVar, Integer.valueOf(i10));
        this.flutterIdToOrigin.put(i10, nVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i5, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i5);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i5);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i5 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i5 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i5 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l10;
        Method method = this.reflectionAccessors.f37304b;
        if (method != null) {
            try {
                l10 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                l10.getClass();
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e7);
            } catch (InvocationTargetException e10) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e10);
            }
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.setDataPosition(0);
                accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                long j8 = parcelObtain.readLong();
                if (m.b(0, j8)) {
                    parcelObtain.readInt();
                }
                if (m.b(1, j8)) {
                    parcelObtain.readLong();
                }
                if (m.b(2, j8)) {
                    parcelObtain.readInt();
                }
                lValueOf = m.b(3, j8) ? Long.valueOf(parcelObtain.readLong()) : null;
                parcelObtain.recycle();
            }
            l10 = lValueOf;
        }
        if (l10 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new n(view, (int) (l10.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        n nVar = this.flutterIdToOrigin.get(i5);
        if (nVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f37309a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(nVar.f37310b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i5, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lA = m.a(this.reflectionAccessors, accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new n(view, (int) (lA.longValue() >> 32)));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i5, Rect rect) {
        Long l10;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f37303a;
        if (method == null) {
            l10 = null;
        } else {
            try {
                l10 = (Long) method.invoke(accessibilityNodeInfoCreateAccessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e7);
            } catch (InvocationTargetException e10) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e10);
            }
        }
        if (l10 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, (int) (l10.longValue() >> 32), i5);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i5, view);
    }

    public boolean onAccessibilityHoverEvent(int i5, MotionEvent motionEvent) {
        n nVar = this.flutterIdToOrigin.get(i5);
        if (nVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f37309a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i10] = pointerProperties;
            motionEvent.getPointerProperties(i10, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i10, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i10] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i5, int i10, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        n nVar = this.flutterIdToOrigin.get(i5);
        if (nVar == null || (accessibilityNodeProvider = nVar.f37309a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(nVar.f37310b, i10, bundle);
    }

    public View platformViewOfNode(int i5) {
        n nVar = this.flutterIdToOrigin.get(i5);
        if (nVar == null) {
            return null;
        }
        return nVar.f37309a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = m.a(this.reflectionAccessors, accessibilityEvent);
        if (lA != null) {
            int iLongValue = (int) (lA.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new n(view, iLongValue));
            if (num == null) {
                int i5 = this.nextFlutterId;
                this.nextFlutterId = i5 + 1;
                Integer numValueOf = Integer.valueOf(i5);
                cacheVirtualIdMappings(view, iLongValue, i5);
                num = numValueOf;
            }
            accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
            accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
            accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i10 = 0; i10 < accessibilityEventObtain.getRecordCount(); i10++) {
                AccessibilityRecord record = accessibilityEventObtain.getRecord(i10);
                Long lA2 = m.a(this.reflectionAccessors, record);
                if (lA2 != null) {
                    n nVar = new n(view, (int) (lA2.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(nVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(nVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
        }
        return false;
    }
}
