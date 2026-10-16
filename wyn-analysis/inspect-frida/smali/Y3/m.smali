.class public final LY3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/g;


# instance fields
.field public final synthetic a:LY3/n;


# direct methods
.method public constructor <init>(LY3/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY3/m;->a:LY3/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LX3/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LY3/m;->a:LY3/n;

    .line 2
    .line 3
    new-instance v1, LY3/l;

    .line 4
    .line 5
    iget-object v0, v0, LY3/n;->g:LHf/x0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, v2}, LY3/l;-><init>(LHf/x0;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, LHf/k0;->o(LHf/l;Ljf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
