.class public final synthetic Landroidx/fragment/app/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/b;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/FragmentActivity;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/ComponentActivity;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/N;

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/fragment/app/N;->a:Landroidx/fragment/app/J;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iget-object v1, p1, Landroidx/fragment/app/O;->d:Landroidx/fragment/app/f0;

    .line 9
    .line 10
    invoke-virtual {v1, p1, p1, v0}, Landroidx/fragment/app/e0;->b(Landroidx/fragment/app/O;Landroidx/fragment/app/M;Landroidx/fragment/app/F;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
