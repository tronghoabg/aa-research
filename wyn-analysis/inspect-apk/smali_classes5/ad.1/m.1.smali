.class public final Lad/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/f;


# instance fields
.field public final synthetic a:Lad/n;


# direct methods
.method public constructor <init>(Lad/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/m;->a:Lad/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/m;->a:Lad/n;

    .line 2
    .line 3
    iget-object v1, v0, Lad/n;->b:LG9/e;

    .line 4
    .line 5
    iget v0, v0, Lad/i;->a:I

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1, p2}, LG9/e;->A(ILjava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
