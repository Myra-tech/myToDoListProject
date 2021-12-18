public class ListItemModel {
    int listNumber;
    String listEntry;
    boolean isComplete = false;

    public ListItemModel() {
    }

    public ListItemModel(int listNumber, String listEntry, boolean isComplete) {
        this.listNumber = listNumber;
        this.listEntry = listEntry;
        this.isComplete = isComplete;
    }

    public int getListNumber() {
        return listNumber;
    }

    public void setListNumber(int listNumber) {
        this.listNumber = listNumber;
    }

    public String getListEntry() {
        return listEntry;
    }

    public void setListEntry(String listEntry) {
        this.listEntry = listEntry;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
