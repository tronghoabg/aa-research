package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class PotentialCreators {
    private List<PotentialCreator> explicitDelegating;
    private List<PotentialCreator> implicitDelegatingConstructors;
    private List<PotentialCreator> implicitDelegatingFactories;
    public PotentialCreator propertiesBased;

    public void addExplicitDelegating(PotentialCreator potentialCreator) {
        if (this.explicitDelegating == null) {
            this.explicitDelegating = new ArrayList();
        }
        this.explicitDelegating.add(potentialCreator);
    }

    public List<PotentialCreator> getExplicitDelegating() {
        List<PotentialCreator> list = this.explicitDelegating;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public List<PotentialCreator> getImplicitDelegatingConstructors() {
        List<PotentialCreator> list = this.implicitDelegatingConstructors;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public List<PotentialCreator> getImplicitDelegatingFactories() {
        List<PotentialCreator> list = this.implicitDelegatingFactories;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean hasDelegating() {
        List<PotentialCreator> list = this.explicitDelegating;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean hasPropertiesBased() {
        return this.propertiesBased != null;
    }

    public boolean hasPropertiesBasedOrDelegating() {
        if (this.propertiesBased != null) {
            return true;
        }
        List<PotentialCreator> list = this.explicitDelegating;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void setImplicitDelegating(List<PotentialCreator> list, List<PotentialCreator> list2) {
        this.implicitDelegatingConstructors = list;
        this.implicitDelegatingFactories = list2;
    }

    public void setPropertiesBased(MapperConfig<?> mapperConfig, PotentialCreator potentialCreator, String str) {
        PotentialCreator potentialCreator2 = this.propertiesBased;
        if (potentialCreator2 != null) {
            throw new IllegalArgumentException(String.format("Conflicting property-based creators: already had %s creator %s, encountered another: %s", str, potentialCreator2.creator(), potentialCreator.creator()));
        }
        this.propertiesBased = potentialCreator.introspectParamNames(mapperConfig);
    }
}
