.class public final Lod/R0;
.super Lmd/D;
.source "SourceFile"


# instance fields
.field public final b:Lod/S0;


# direct methods
.method public constructor <init>(Lod/S0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/R0;->b:Lod/S0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LX2/j;
    .locals 3

    .line 1
    iget-object v0, p0, Lod/R0;->b:Lod/S0;

    .line 2
    .line 3
    const-string v1, "config"

    .line 4
    .line 5
    invoke-static {v0, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LX2/j;

    .line 9
    .line 10
    sget-object v2, Lmd/k0;->e:Lmd/k0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, LX2/j;-><init>(Lmd/k0;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method
