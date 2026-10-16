.class public final LSe/o;
.super LHe/g;
.source "SourceFile"

# interfaces
.implements LOe/f;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSe/o;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 1

    .line 1
    sget-object v0, LMe/b;->a:LMe/b;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LHe/h;->a(LJe/b;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/o;->a:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-interface {p1, v0}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/o;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
