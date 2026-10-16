package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.applovin.shadow.okio.Segment;
import ef.C2527k;
import ff.o;
import ff.p;
import ff.v;
import ff.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class MemberDeserializer {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final DeserializationContext f39771c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ AnnotatedCallableKind $kind;
        final /* synthetic */ MessageLite $proto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
            super(0);
            this.$proto = messageLite;
            this.$kind = annotatedCallableKind;
        }

        @Override // tf.a
        @NotNull
        public final List<AnnotationDescriptor> invoke() {
            List<AnnotationDescriptor> listS0;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f39771c.getContainingDeclaration());
            if (protoContainerAsProtoContainer != null) {
                listS0 = o.S0(MemberDeserializer.this.f39771c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerAsProtoContainer, this.$proto, this.$kind));
            } else {
                listS0 = null;
            }
            return listS0 == null ? v.f35432a : listS0;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33611 extends AbstractC3343n implements a {
        final /* synthetic */ boolean $isDelegate;
        final /* synthetic */ ProtoBuf.Property $proto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33611(boolean z2, ProtoBuf.Property property) {
            super(0);
            this.$isDelegate = z2;
            this.$proto = property;
        }

        @Override // tf.a
        @NotNull
        public final List<AnnotationDescriptor> invoke() {
            List<AnnotationDescriptor> listS0;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f39771c.getContainingDeclaration());
            if (protoContainerAsProtoContainer != null) {
                boolean z2 = this.$isDelegate;
                MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                ProtoBuf.Property property = this.$proto;
                listS0 = z2 ? o.S0(memberDeserializer2.f39771c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerAsProtoContainer, property)) : o.S0(memberDeserializer2.f39771c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerAsProtoContainer, property));
            } else {
                listS0 = null;
            }
            return listS0 == null ? v.f35432a : listS0;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33621 extends AbstractC3343n implements a {
        final /* synthetic */ AnnotatedCallableKind $kind;
        final /* synthetic */ MessageLite $proto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33621(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
            super(0);
            this.$proto = messageLite;
            this.$kind = annotatedCallableKind;
        }

        @Override // tf.a
        @NotNull
        public final List<AnnotationDescriptor> invoke() {
            List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f39771c.getContainingDeclaration());
            if (protoContainerAsProtoContainer != null) {
                listLoadExtensionReceiverParameterAnnotations = MemberDeserializer.this.f39771c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerAsProtoContainer, this.$proto, this.$kind);
            } else {
                listLoadExtensionReceiverParameterAnnotations = null;
            }
            return listLoadExtensionReceiverParameterAnnotations == null ? v.f35432a : listLoadExtensionReceiverParameterAnnotations;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC3343n implements a {
        final /* synthetic */ DeserializedPropertyDescriptor $property;
        final /* synthetic */ ProtoBuf.Property $proto;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements a {
            final /* synthetic */ DeserializedPropertyDescriptor $property;
            final /* synthetic */ ProtoBuf.Property $proto;
            final /* synthetic */ MemberDeserializer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
                super(0);
                this.this$0 = memberDeserializer;
                this.$proto = property;
                this.$property = deserializedPropertyDescriptor;
            }

            @Override // tf.a
            @Nullable
            public final ConstantValue<?> invoke() {
                MemberDeserializer memberDeserializer = this.this$0;
                ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f39771c.getContainingDeclaration());
                AbstractC3340k.b(protoContainerAsProtoContainer);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = this.this$0.f39771c.getComponents().getAnnotationAndConstantLoader();
                ProtoBuf.Property property = this.$proto;
                KotlinType returnType = this.$property.getReturnType();
                AbstractC3340k.d(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadPropertyConstant(protoContainerAsProtoContainer, property, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.$proto = property;
            this.$property = deserializedPropertyDescriptor;
        }

        @Override // tf.a
        public final NullableLazyValue<ConstantValue<?>> invoke() {
            return MemberDeserializer.this.f39771c.getStorageManager().createNullableLazyValue(new AnonymousClass1(MemberDeserializer.this, this.$proto, this.$property));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5, reason: invalid class name */
    public static final class AnonymousClass5 extends AbstractC3343n implements a {
        final /* synthetic */ DeserializedPropertyDescriptor $property;
        final /* synthetic */ ProtoBuf.Property $proto;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements a {
            final /* synthetic */ DeserializedPropertyDescriptor $property;
            final /* synthetic */ ProtoBuf.Property $proto;
            final /* synthetic */ MemberDeserializer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
                super(0);
                this.this$0 = memberDeserializer;
                this.$proto = property;
                this.$property = deserializedPropertyDescriptor;
            }

            @Override // tf.a
            @Nullable
            public final ConstantValue<?> invoke() {
                MemberDeserializer memberDeserializer = this.this$0;
                ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f39771c.getContainingDeclaration());
                AbstractC3340k.b(protoContainerAsProtoContainer);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = this.this$0.f39771c.getComponents().getAnnotationAndConstantLoader();
                ProtoBuf.Property property = this.$proto;
                KotlinType returnType = this.$property.getReturnType();
                AbstractC3340k.d(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadAnnotationDefaultValue(protoContainerAsProtoContainer, property, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.$proto = property;
            this.$property = deserializedPropertyDescriptor;
        }

        @Override // tf.a
        public final NullableLazyValue<ConstantValue<?>> invoke() {
            return MemberDeserializer.this.f39771c.getStorageManager().createNullableLazyValue(new AnonymousClass1(MemberDeserializer.this, this.$proto, this.$property));
        }
    }

    public MemberDeserializer(@NotNull DeserializationContext c10) {
        AbstractC3340k.e(c10, "c");
        this.f39771c = c10;
        this.annotationDeserializer = new AnnotationDeserializer(c10.getComponents().getModuleDescriptor(), c10.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f39771c.getNameResolver(), this.f39771c.getTypeTable(), this.f39771c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(MessageLite messageLite, int i5, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i5).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f39771c.getStorageManager(), new AnonymousClass1(messageLite, annotatedCallableKind));
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f39771c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(ProtoBuf.Property property, boolean z2) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f39771c.getStorageManager(), new C33611(z2, property));
    }

    private final Annotations getReceiverParameterAnnotations(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f39771c.getStorageManager(), new C33621(messageLite, annotatedCallableKind));
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i5) {
        return (i5 & 63) + ((i5 >> 8) << 6);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i5) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i5);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor containingDeclaration = this.f39771c.getContainingDeclaration();
        AbstractC3340k.c(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        AbstractC3340k.d(containingDeclaration2, "getContainingDeclaration(...)");
        ProtoContainer protoContainerAsProtoContainer = asProtoContainer(containingDeclaration2);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(p.a0(list2, 10));
        int i5 = 0;
        for (Object obj : list2) {
            int i10 = i5 + 1;
            KotlinType kotlinTypeType = null;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerAsProtoContainer == null || !AbstractC3256n.q(Flags.HAS_ANNOTATIONS, flags, "get(...)")) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f39771c.getStorageManager(), new MemberDeserializer$valueParameters$1$annotations$1(this, protoContainerAsProtoContainer, messageLite, annotatedCallableKind, i5, valueParameter));
            Name name = NameResolverUtilKt.getName(this.f39771c.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType2 = this.f39771c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f39771c.getTypeTable()));
            boolean zQ = AbstractC3256n.q(Flags.DECLARES_DEFAULT_VALUE, flags, "get(...)");
            boolean zQ2 = AbstractC3256n.q(Flags.IS_CROSSINLINE, flags, "get(...)");
            boolean zQ3 = AbstractC3256n.q(Flags.IS_NOINLINE, flags, "get(...)");
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f39771c.getTypeTable());
            if (typeVarargElementType != null) {
                kotlinTypeType = this.f39771c.getTypeDeserializer().type(typeVarargElementType);
            }
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            AbstractC3340k.d(NO_SOURCE, "NO_SOURCE");
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i5, empty, name, kotlinTypeType2, zQ, zQ2, zQ3, kotlinTypeType, NO_SOURCE));
            callableDescriptor = callableDescriptor2;
            i5 = i10;
        }
        return o.S0(arrayList);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor proto, boolean z2) {
        AbstractC3340k.e(proto, "proto");
        DeclarationDescriptor containingDeclaration = this.f39771c.getContainingDeclaration();
        AbstractC3340k.c(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z2, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f39771c.getNameResolver(), this.f39771c.getTypeTable(), this.f39771c.getVersionRequirementTable(), this.f39771c.getContainerSource(), null, Segment.SHARE_MINIMUM, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f39771c, deserializedClassConstructorDescriptor, v.f35432a, null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        AbstractC3340k.d(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function proto) {
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        Throwable th;
        KotlinType kotlinTypeType;
        AbstractC3340k.e(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(proto) ? getReceiverParameterAnnotations(proto, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f39771c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f39771c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), proto, this.f39771c.getNameResolver(), this.f39771c.getTypeTable(), AbstractC3340k.a(DescriptorUtilsKt.getFqNameSafe(this.f39771c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f39771c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f39771c.getVersionRequirementTable(), this.f39771c.getContainerSource(), null, Segment.SHARE_MINIMUM, null);
        DeserializationContext deserializationContext = this.f39771c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        AbstractC3340k.d(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f39771c.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
            th = null;
        } else {
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, receiverParameterAnnotations);
            th = null;
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f39771c.getTypeTable());
        Throwable th2 = th;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw th2;
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedSimpleFunctionDescriptor, i5);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i5 = i10;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        AbstractC3340k.d(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listValueParameters = memberDeserializer.valueParameters(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f39771c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, arrayList, ownTypeParameters, listValueParameters, kotlinTypeType2, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), w.f35433a);
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        AbstractC3340k.d(bool, "get(...)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        AbstractC3340k.d(bool2, "get(...)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        AbstractC3340k.d(bool3, "get(...)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        AbstractC3340k.d(bool4, "get(...)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        AbstractC3340k.d(bool5, "get(...)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        AbstractC3340k.d(bool6, "get(...)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        AbstractC3340k.d(bool7, "get(...)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        C2527k c2527kDeserializeContractFromFunction = this.f39771c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f39771c.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (c2527kDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) c2527kDeserializeContractFromFunction.f34671a, c2527kDeserializeContractFromFunction.f34672b);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull ProtoBuf.Property proto) {
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeType;
        AbstractC3340k.e(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.f39771c.getContainingDeclaration();
        Annotations annotations = getAnnotations(proto, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        int i5 = flags;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), AbstractC3256n.q(Flags.IS_VAR, flags, "get(...)"), NameResolverUtilKt.getName(this.f39771c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), AbstractC3256n.q(Flags.IS_LATEINIT, flags, "get(...)"), AbstractC3256n.q(Flags.IS_CONST, flags, "get(...)"), AbstractC3256n.q(Flags.IS_EXTERNAL_PROPERTY, flags, "get(...)"), AbstractC3256n.q(Flags.IS_DELEGATED, flags, "get(...)"), AbstractC3256n.q(Flags.IS_EXPECT_PROPERTY, flags, "get(...)"), proto, this.f39771c.getNameResolver(), this.f39771c.getTypeTable(), this.f39771c.getVersionRequirementTable(), this.f39771c.getContainerSource());
        DeserializationContext deserializationContext2 = this.f39771c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        AbstractC3340k.d(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        boolean zQ = AbstractC3256n.q(Flags.HAS_GETTER, i5, "get(...)");
        Annotations receiverParameterAnnotations = (zQ && ProtoTypeTableUtilKt.hasReceiver(proto)) ? getReceiverParameterAnnotations(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f39771c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f39771c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, receiverParameterAnnotations);
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f39771c.getTypeTable());
        ArrayList arrayList = new ArrayList(p.a0(listContextReceiverTypes, 10));
        int i10 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedPropertyDescriptor, i10));
            i10 = i11;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList);
        boolean zQ2 = AbstractC3256n.q(Flags.HAS_ANNOTATIONS, i5, "get(...)");
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i5);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zQ2, visibility, flagField4.get(i5), false, false, false);
        if (zQ) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            boolean zQ3 = AbstractC3256n.q(Flags.IS_NOT_DEFAULT, getterFlags, "get(...)");
            boolean zQ4 = AbstractC3256n.q(Flags.IS_EXTERNAL_ACCESSOR, getterFlags, "get(...)");
            boolean zQ5 = AbstractC3256n.q(Flags.IS_INLINE_ACCESSOR, getterFlags, "get(...)");
            Annotations annotations2 = getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zQ3) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                flagField = flagField3;
                deserializationContext = deserializationContextChildContext$default;
                flagField2 = flagField4;
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !zQ3, zQ4, zQ5, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = deserializationContextChildContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                AbstractC3340k.b(propertyGetterDescriptorImplCreateDefaultGetter);
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = deserializationContextChildContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImplCreateDefaultGetter = null;
        }
        if (AbstractC3256n.q(Flags.HAS_SETTER, i5, "get(...)")) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i12 = accessorFlags;
            boolean zQ6 = AbstractC3256n.q(Flags.IS_NOT_DEFAULT, i12, "get(...)");
            boolean zQ7 = AbstractC3256n.q(Flags.IS_EXTERNAL_ACCESSOR, i12, "get(...)");
            boolean zQ8 = AbstractC3256n.q(Flags.IS_INLINE_ACCESSOR, i12, "get(...)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(proto, i12, annotatedCallableKind);
            if (zQ6) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField2.get(i12)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i12)), !zQ6, zQ7, zQ8, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) o.I0(DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, v.f35432a, null, null, null, null, 60, null).getMemberDeserializer().valueParameters(AbstractC3935e.C(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                AbstractC3340k.b(propertySetterDescriptorImplCreateDefaultSetter);
                propertySetterDescriptorImpl = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
            propertySetterDescriptorImpl = null;
        }
        if (AbstractC3256n.q(Flags.HAS_CONSTANT, i5, "get(...)")) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new AnonymousClass4(proto, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor containingDeclaration2 = this.f39771c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new AnonymousClass5(proto, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias proto) {
        AbstractC3340k.e(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        AbstractC3340k.d(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            AbstractC3340k.b(annotation);
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f39771c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f39771c.getStorageManager(), this.f39771c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f39771c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f39771c.getNameResolver(), this.f39771c.getTypeTable(), this.f39771c.getVersionRequirementTable(), this.f39771c.getContainerSource());
        DeserializationContext deserializationContext = this.f39771c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        AbstractC3340k.d(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f39771c.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f39771c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
