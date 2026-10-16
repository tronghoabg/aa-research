.class public final LC4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC4/f;


# instance fields
.field public final a:LF4/f;


# direct methods
.method public constructor <init>(LF4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC4/m;->a:LF4/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LC4/g;
    .locals 2

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    new-instance v0, LC4/i;

    .line 4
    .line 5
    iget-object v1, p0, LC4/m;->a:LF4/f;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, LC4/i;-><init>(Ljava/io/InputStream;LF4/f;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object v0
.end method
