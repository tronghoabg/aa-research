package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import h.g.b.ad;
import h.g.b.o;
import h.g.b.x;
import h.i.a;
import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseKeyFramesScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(BaseKeyFramesScope.class, "easing", "getEasing()Landroidx/constraintlayout/compose/Easing;", 0)};
    public static final int $stable = 8;
    private final a easing$delegate;
    private final CLArray framesContainer;
    private final CLObject keyFramePropsObject;
    private final CLArray targetsContainer;

    private BaseKeyFramesScope(ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        CLObject cLObject = new CLObject(new char[0]);
        cLObject.clear();
        this.keyFramePropsObject = cLObject;
        CLArray cLArray = new CLArray(new char[0]);
        this.targetsContainer = cLArray;
        CLArray cLArray2 = new CLArray(new char[0]);
        this.framesContainer = cLArray2;
        this.easing$delegate = addNameOnPropertyChange$constraintlayout_compose(Easing.Companion.getStandard(), "transitionEasing");
        cLObject.put(TypedValues.AttributesType.S_TARGET, cLArray);
        cLObject.put("frames", cLArray2);
        for (ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            char[] charArray = constrainedLayoutReference.getId$constraintlayout_compose().toString().toCharArray();
            x.e(charArray, "toCharArray(...)");
            CLArray cLArray3 = this.targetsContainer;
            CLString cLString = new CLString(charArray);
            cLString.setStart(0L);
            cLString.setEnd(charArray.length - 1);
            cLArray3.add(cLString);
        }
    }

    public static /* synthetic */ a addNameOnPropertyChange$constraintlayout_compose$default(BaseKeyFramesScope baseKeyFramesScope, NamedPropertyOrValue namedPropertyOrValue, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return baseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose(namedPropertyOrValue, str);
    }

    public final <E extends NamedPropertyOrValue> a<E> addNameOnPropertyChange$constraintlayout_compose(final E e2, final String str) {
        return new a(e2) { // from class: androidx.constraintlayout.compose.BaseKeyFramesScope$addNameOnPropertyChange$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // h.i.a
            public void afterChange(r rVar, NamedPropertyOrValue namedPropertyOrValue, NamedPropertyOrValue namedPropertyOrValue2) {
                String name = str;
                if (name == null) {
                    name = rVar.getName();
                }
                if (namedPropertyOrValue2 != null) {
                    this.getKeyFramePropsObject$constraintlayout_compose().putString(name, namedPropertyOrValue2.getName());
                }
            }
        };
    }

    public final Easing getEasing() {
        return (Easing) this.easing$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final CLArray getFramesContainer$constraintlayout_compose() {
        return this.framesContainer;
    }

    public final CLObject getKeyFramePropsObject$constraintlayout_compose() {
        return this.keyFramePropsObject;
    }

    public final void setEasing(Easing easing) {
        this.easing$delegate.setValue(this, $$delegatedProperties[0], easing);
    }

    public /* synthetic */ BaseKeyFramesScope(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, o oVar) {
        this(constrainedLayoutReferenceArr);
    }
}
