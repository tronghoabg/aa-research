package gatewayprotocol.v1;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ef.InterfaceC2519c;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionDataKt {

    @NotNull
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R$\u00104\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R$\u00107\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R*\u0010;\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b:\u0010\u000b\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R$\u0010A\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010G\u001a\u00020B2\u0006\u0010\u001d\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R$\u0010M\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010%\"\u0004\bL\u0010'¨\u0006O"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;)V", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "_build", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lef/C;", "clearTimestamp", "()V", "", "hasTimestamp", "()Z", "clearProductId", "clearEventId", "clearTransactionId", "clearProduct", "clearTransaction", "clearReceipt", "hasReceipt", "clearTransactionState", "clearJwsRepresentation", "hasJwsRepresentation", "clearSignature", "hasSignature", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "Lcom/google/protobuf/Timestamp;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "timestamp", "", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "Lcom/google/protobuf/ByteString;", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "eventId", "getTransactionId", "setTransactionId", "transactionId", "getProduct", "setProduct", AppLovinEventTypes.USER_VIEWED_PRODUCT, "getTransaction", "setTransaction", "transaction", "getReceipt", "setReceipt", "getReceipt$annotations", "receipt", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "getTransactionState", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "setTransactionState", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;)V", "transactionState", "", "getTransactionStateValue", "()I", "setTransactionStateValue", "(I)V", "transactionStateValue", "getJwsRepresentation", "setJwsRepresentation", "jwsRepresentation", "getSignature", "setSignature", InAppPurchaseMetaData.KEY_SIGNATURE, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @InterfaceC2519c
        public static /* synthetic */ void getReceipt$annotations() {
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData transactionDataBuild = this._builder.build();
            AbstractC3340k.d(transactionDataBuild, "_builder.build()");
            return transactionDataBuild;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            AbstractC3340k.d(eventId, "_builder.getEventId()");
            return eventId;
        }

        @NotNull
        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            AbstractC3340k.d(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        @NotNull
        public final String getProduct() {
            String product = this._builder.getProduct();
            AbstractC3340k.d(product, "_builder.getProduct()");
            return product;
        }

        @NotNull
        public final String getProductId() {
            String productId = this._builder.getProductId();
            AbstractC3340k.d(productId, "_builder.getProductId()");
            return productId;
        }

        @NotNull
        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            AbstractC3340k.d(receipt, "_builder.getReceipt()");
            return receipt;
        }

        @NotNull
        public final String getSignature() {
            String signature = this._builder.getSignature();
            AbstractC3340k.d(signature, "_builder.getSignature()");
            return signature;
        }

        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            AbstractC3340k.d(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        @NotNull
        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            AbstractC3340k.d(transaction, "_builder.getTransaction()");
            return transaction;
        }

        @NotNull
        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            AbstractC3340k.d(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        @NotNull
        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            AbstractC3340k.d(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(@NotNull ByteString value) {
            AbstractC3340k.e(value, "value");
            this._builder.setEventId(value);
        }

        public final void setJwsRepresentation(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setJwsRepresentation(value);
        }

        public final void setProduct(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setProduct(value);
        }

        public final void setProductId(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setProductId(value);
        }

        public final void setReceipt(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setReceipt(value);
        }

        public final void setSignature(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setSignature(value);
        }

        public final void setTimestamp(@NotNull Timestamp value) {
            AbstractC3340k.e(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void setTransaction(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setTransaction(value);
        }

        public final void setTransactionId(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void setTransactionState(@NotNull TransactionEventRequestOuterClass.TransactionState value) {
            AbstractC3340k.e(value, "value");
            this._builder.setTransactionState(value);
        }

        public final void setTransactionStateValue(int i5) {
            this._builder.setTransactionStateValue(i5);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionDataKt() {
    }
}
