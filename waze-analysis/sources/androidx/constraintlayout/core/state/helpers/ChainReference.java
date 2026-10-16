package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ChainReference extends HelperReference {
    protected float mBias;
    private HashMap<String, Float> mMapPostGoneMargin;

    @Deprecated
    protected HashMap<String, Float> mMapPostMargin;
    private HashMap<String, Float> mMapPreGoneMargin;

    @Deprecated
    protected HashMap<String, Float> mMapPreMargin;

    @Deprecated
    protected HashMap<String, Float> mMapWeights;
    protected State.Chain mStyle;

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
        this.mBias = 0.5f;
        this.mMapWeights = new HashMap<>();
        this.mMapPreMargin = new HashMap<>();
        this.mMapPostMargin = new HashMap<>();
        this.mStyle = State.Chain.SPREAD;
    }

    public void addChainElement(Object obj, float f2, float f3, float f4, float f5, float f6) {
        super.add(obj);
        String string = obj.toString();
        if (!Float.isNaN(f2)) {
            this.mMapWeights.put(string, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.mMapPreMargin.put(string, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            this.mMapPostMargin.put(string, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            HashMap<String, Float> map = this.mMapPreGoneMargin;
            if (map == null) {
                map = new HashMap<>();
                this.mMapPreGoneMargin = map;
            }
            map.put(string, Float.valueOf(f5));
        }
        if (Float.isNaN(f6)) {
            return;
        }
        HashMap<String, Float> map2 = this.mMapPostGoneMargin;
        if (map2 == null) {
            map2 = new HashMap<>();
            this.mMapPostGoneMargin = map2;
        }
        map2.put(string, Float.valueOf(f6));
    }

    public float getBias() {
        return this.mBias;
    }

    float getPostGoneMargin(String str) {
        HashMap<String, Float> map = this.mMapPostGoneMargin;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostGoneMargin.get(str).floatValue();
    }

    protected float getPostMargin(String str) {
        if (this.mMapPostMargin.containsKey(str)) {
            return this.mMapPostMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    float getPreGoneMargin(String str) {
        HashMap<String, Float> map = this.mMapPreGoneMargin;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreGoneMargin.get(str).floatValue();
    }

    protected float getPreMargin(String str) {
        if (this.mMapPreMargin.containsKey(str)) {
            return this.mMapPreMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    public State.Chain getStyle() {
        return State.Chain.SPREAD;
    }

    protected float getWeight(String str) {
        if (this.mMapWeights.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public ChainReference style(State.Chain chain) {
        this.mStyle = chain;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ChainReference bias(float f2) {
        this.mBias = f2;
        return this;
    }

    public void addChainElement(String str, float f2, float f3, float f4) {
        addChainElement(str, f2, f3, f4, 0.0f, 0.0f);
    }
}
