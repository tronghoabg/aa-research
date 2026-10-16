.class public final LU1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/H;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:LN1/N;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lk2/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU1/t;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p1, p2, Lk2/D;->o:Lk2/B;

    .line 7
    .line 8
    iput-object p1, p0, LU1/t;->b:LN1/N;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()LN1/N;
    .locals 1

    .line 1
    iget-object v0, p0, LU1/t;->b:LN1/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUid()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LU1/t;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
