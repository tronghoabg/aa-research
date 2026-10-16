.class public final Lcom/google/protobuf/H1;
.super Landroidx/datastore/preferences/protobuf/i0;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lcom/google/protobuf/F1;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/F1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/H1;->c:Lcom/google/protobuf/F1;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/i0;-><init>(ILjava/util/Map;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/G1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/H1;->c:Lcom/google/protobuf/F1;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/protobuf/G1;-><init>(Lcom/google/protobuf/F1;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
