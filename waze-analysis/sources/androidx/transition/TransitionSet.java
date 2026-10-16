package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TransitionSet extends Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    ArrayList<Transition> mTransitions;
    private Transition[] mTransitionsCache;

    /* compiled from: WazeSource */
    class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            int i2 = transitionSet.mCurrentListeners - 1;
            transitionSet.mCurrentListeners = i2;
            if (i2 == 0) {
                transitionSet.mStarted = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            if (transitionSet.mStarted) {
                return;
            }
            transitionSet.start();
            this.mTransitionSet.mStarted = true;
        }
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addTransitionInternal(Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
    }

    private int indexOfTransition(long j2) {
        int i2 = 1;
        while (true) {
            int size = this.mTransitions.size();
            ArrayList<Transition> arrayList = this.mTransitions;
            if (i2 >= size) {
                return arrayList.size() - 1;
            }
            if (arrayList.get(i2).mSeekOffsetInParent > j2) {
                return i2 - 1;
            }
            i2++;
        }
    }

    private void returnTransitionArrayToCache(Transition[] transitionArr) {
        Arrays.fill(transitionArr, (Object) null);
        this.mTransitionsCache = transitionArr;
    }

    private void setupStartEndListeners() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        ArrayList<Transition> arrayList = this.mTransitions;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    private Transition[] transitionsAsArray() {
        Transition[] transitionArr = this.mTransitionsCache;
        this.mTransitionsCache = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.mTransitions.size()];
        }
        return (Transition[]) this.mTransitions.toArray(transitionArr);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addListener(Transition.TransitionListener transitionListener) {
        super.addListener(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(int i2) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).addTarget(i2);
        }
        super.addTarget(i2);
        return this;
    }

    public TransitionSet addTransition(Transition transition) {
        addTransitionInternal(transition);
        long j2 = this.mDuration;
        if (j2 >= 0) {
            transition.setDuration(j2);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
        super.cancel();
        Transition[] transitionArrTransitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionArrTransitionsAsArray[i2].cancel();
        }
        returnTransitionArrayToCache(transitionArrTransitionsAsArray);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            ArrayList<Transition> arrayList = this.mTransitions;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Transition transition = arrayList.get(i2);
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            ArrayList<Transition> arrayList = this.mTransitions;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Transition transition = arrayList.get(i2);
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public Transition mo13405clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo13405clone();
        transitionSet.mTransitions = new ArrayList<>();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionSet.addTransitionInternal(this.mTransitions.get(i2).mo13405clone());
        }
        return transitionSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void createAnimators(android.view.ViewGroup r13, androidx.transition.TransitionValuesMaps r14, androidx.transition.TransitionValuesMaps r15, java.util.ArrayList<androidx.transition.TransitionValues> r16, java.util.ArrayList<androidx.transition.TransitionValues> r17) {
        /*
            r12 = this;
            long r0 = r12.getStartDelay()
            java.util.ArrayList<androidx.transition.Transition> r2 = r12.mTransitions
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L41
            java.util.ArrayList<androidx.transition.Transition> r5 = r12.mTransitions
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            androidx.transition.Transition r6 = (androidx.transition.Transition) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L34
            boolean r5 = r12.mPlayTogether
            if (r5 != 0) goto L24
            if (r4 != 0) goto L34
            r4 = r3
        L24:
            long r9 = r6.getStartDelay()
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L31
            long r9 = r9 + r0
            r6.setStartDelay(r9)
            goto L34
        L31:
            r6.setStartDelay(r0)
        L34:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.createAnimators(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto Lc
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionSet.createAnimators(android.view.ViewGroup, androidx.transition.TransitionValuesMaps, androidx.transition.TransitionValuesMaps, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(int i2, boolean z) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).excludeTarget(i2, z);
        }
        super.excludeTarget(i2, z);
        return this;
    }

    @Override // androidx.transition.Transition
    void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        Transition[] transitionArrTransitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionArrTransitionsAsArray[i2].forceToEnd(viewGroup);
        }
        returnTransitionArrayToCache(transitionArrTransitionsAsArray);
    }

    public int getOrdering() {
        return this.mPlayTogether ? 0 : 1;
    }

    public Transition getTransitionAt(int i2) {
        if (i2 < 0 || i2 >= this.mTransitions.size()) {
            return null;
        }
        return this.mTransitions.get(i2);
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    @Override // androidx.transition.Transition
    boolean hasAnimators() {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            if (this.mTransitions.get(i2).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.mTransitions.get(i2).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                TransitionSet.this.mTransitions.remove(transition);
                if (TransitionSet.this.hasAnimators()) {
                    return;
                }
                TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_CANCEL, false);
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.mEnded = true;
                transitionSet.notifyListeners(Transition.TransitionNotification.ON_END, false);
            }
        };
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            Transition transition = this.mTransitions.get(i2);
            transition.addListener(transitionListenerAdapter);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.mPlayTogether) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j2 = this.mTotalDuration;
                transition.mSeekOffsetInParent = j2;
                this.mTotalDuration = j2 + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeListener(Transition.TransitionListener transitionListener) {
        super.removeListener(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(int i2) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).removeTarget(i2);
        }
        super.removeTarget(i2);
        return this;
    }

    public TransitionSet removeTransition(Transition transition) {
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    public void resume(View view) {
        super.resume(view);
        Transition[] transitionArrTransitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionArrTransitionsAsArray[i2].resume(view);
        }
        returnTransitionArrayToCache(transitionArrTransitionsAsArray);
    }

    @Override // androidx.transition.Transition
    protected void runAnimators() {
        ArrayList<Transition> arrayList;
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        setupStartEndListeners();
        if (this.mPlayTogether) {
            ArrayList<Transition> arrayList2 = this.mTransitions;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.get(i2).runAnimators();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size2 = this.mTransitions.size();
            arrayList = this.mTransitions;
            if (i3 >= size2) {
                break;
            }
            Transition transition = arrayList.get(i3 - 1);
            final Transition transition2 = this.mTransitions.get(i3);
            transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition3) {
                    transition2.runAnimators();
                    transition3.removeListener(this);
                }
            });
            i3++;
        }
        Transition transition3 = arrayList.get(0);
        if (transition3 != null) {
            transition3.runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).setCanRemoveViews(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setCurrentPlayTimeMillis(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.getTotalDurationMillis()
            androidx.transition.TransitionSet r7 = r0.mParent
            r8 = 0
            if (r7 == 0) goto L20
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lbe
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto Lbe
        L20:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L28
            r12 = r11
            goto L29
        L28:
            r12 = r10
        L29:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L31
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L39
        L31:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L40
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L40
        L39:
            r0.mEnded = r10
            androidx.transition.Transition$TransitionNotification r14 = androidx.transition.Transition.TransitionNotification.ON_START
            r0.notifyListeners(r14, r12)
        L40:
            boolean r14 = r0.mPlayTogether
            if (r14 == 0) goto L5a
        L44:
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.mTransitions
            int r7 = r7.size()
            if (r10 >= r7) goto L84
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.mTransitions
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            r7.setCurrentPlayTimeMillis(r1, r3)
            int r10 = r10 + 1
            goto L44
        L5a:
            int r10 = r0.indexOfTransition(r3)
            if (r7 < 0) goto L87
        L60:
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.mTransitions
            int r7 = r7.size()
            if (r10 >= r7) goto L84
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.mTransitions
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            long r14 = r7.mSeekOffsetInParent
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 < 0) goto La3
            long r14 = r3 - r14
            r7.setCurrentPlayTimeMillis(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L60
        L84:
            r16 = r8
            goto La3
        L87:
            r16 = r8
        L89:
            if (r10 < 0) goto La3
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.mTransitions
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            long r8 = r7.mSeekOffsetInParent
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.setCurrentPlayTimeMillis(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 >= 0) goto La3
            int r10 = r10 + (-1)
            goto L89
        La3:
            androidx.transition.TransitionSet r7 = r0.mParent
            if (r7 == 0) goto Lbe
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Laf
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb5
        Laf:
            if (r13 >= 0) goto Lbe
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lbe
        Lb5:
            if (r1 <= 0) goto Lb9
            r0.mEnded = r11
        Lb9:
            androidx.transition.Transition$TransitionNotification r1 = androidx.transition.Transition.TransitionNotification.ON_END
            r0.notifyListeners(r1, r12)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionSet.setCurrentPlayTimeMillis(long, long):void");
    }

    @Override // androidx.transition.Transition
    public TransitionSet setDuration(long j2) {
        ArrayList<Transition> arrayList;
        super.setDuration(j2);
        if (this.mDuration >= 0 && (arrayList = this.mTransitions) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mTransitions.get(i2).setDuration(j2);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).setEpicenterCallback(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        this.mChangeFlags |= 1;
        ArrayList<Transition> arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mTransitions.get(i2).setInterpolator(timeInterpolator);
            }
        }
        super.setInterpolator(timeInterpolator);
        return this;
    }

    public TransitionSet setOrdering(int i2) {
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
            }
            z = false;
        }
        this.mPlayTogether = z;
        return this;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
                this.mTransitions.get(i2).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.mChangeFlags |= 2;
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public TransitionSet setStartDelay(long j2) {
        super.setStartDelay(j2);
        return this;
    }

    @Override // androidx.transition.Transition
    String toString(String str) {
        String string = super.toString(str);
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            string = string + "\n" + this.mTransitions.get(i2).toString(String.valueOf(str).concat("  "));
        }
        return string;
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(View view, boolean z) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(view, z);
        }
        super.excludeTarget(view, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(Class<?> cls, boolean z) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(cls, z);
        }
        super.excludeTarget(cls, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(View view) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(view);
        }
        super.addTarget(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(View view) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(view);
        }
        super.removeTarget(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(String str, boolean z) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(str, z);
        }
        super.excludeTarget(str, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition addTarget(Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition removeTarget(Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(Class<?> cls) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(cls);
        }
        super.addTarget(cls);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(Class<?> cls) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(cls);
        }
        super.removeTarget(cls);
        return this;
    }

    public TransitionSet() {
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(String str) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(str);
        }
        super.addTarget(str);
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(String str) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(str);
        }
        super.removeTarget(str);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo13405clone() {
        return mo13405clone();
    }
}
