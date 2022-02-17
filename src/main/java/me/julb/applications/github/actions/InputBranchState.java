package me.julb.applications.github.actions;

/**
 * The input branch state. <br>
 * @author Julb.
 */
enum InputBranchState {
    /**
     * The branch needs to be created.
     */
    PRESENT,

    /**
     * The branch needs to be deleted.
     */
    ABSENT;
}