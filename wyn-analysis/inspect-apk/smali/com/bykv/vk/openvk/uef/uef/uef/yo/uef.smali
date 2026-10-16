.class public Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:I

.field private uef:I

.field private yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->uef:I

    .line 3
    iput p2, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->oa:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->uef:I

    .line 6
    iput p2, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->oa:I

    .line 7
    iput-object p3, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->yo:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->oa:I

    .line 2
    .line 3
    return v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->uef:I

    return v0
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->yo:Ljava/lang/String;

    return-void
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
