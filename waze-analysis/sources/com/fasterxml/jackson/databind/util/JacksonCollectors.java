package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JacksonCollectors {
    public static Collector<JsonNode, ArrayNode, ArrayNode> toArrayNode(final JsonNodeCreator jsonNodeCreator) {
        Objects.requireNonNull(jsonNodeCreator);
        return Collector.CC.of(new Supplier() { // from class: com.fasterxml.jackson.databind.util.JacksonCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return jsonNodeCreator.arrayNode();
            }
        }, new BiConsumer() { // from class: com.fasterxml.jackson.databind.util.JacksonCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ArrayNode) obj).add((JsonNode) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.fasterxml.jackson.databind.util.JacksonCollectors$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ArrayNode) obj).addAll((ArrayNode) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector<JsonNode, ArrayNode, ArrayNode> toArrayNode() {
        return toArrayNode(JsonNodeFactory.instance);
    }
}
