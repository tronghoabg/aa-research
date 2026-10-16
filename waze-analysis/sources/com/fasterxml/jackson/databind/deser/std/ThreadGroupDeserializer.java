package com.fasterxml.jackson.databind.deser.std;

import androidx.autofill.HintConstants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ThreadGroupDeserializer extends StdNodeBasedDeserializer<ThreadGroup> {
    private static final long serialVersionUID = 1;

    protected ThreadGroupDeserializer() {
        super(ThreadGroup.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdNodeBasedDeserializer
    public ThreadGroup convert(JsonNode jsonNode, DeserializationContext deserializationContext) {
        String strAsText = jsonNode.path(HintConstants.AUTOFILL_HINT_NAME).asText();
        if (strAsText == null) {
            strAsText = "";
        }
        return new ThreadGroup(strAsText);
    }
}
